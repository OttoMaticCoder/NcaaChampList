package nattychamp.demo.web;

import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.service.WrestlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ChampController {
    private WrestlerService wrestlerService;

    @Autowired
    public ChampController (WrestlerService wrestlerService) {
        this.wrestlerService = wrestlerService;
    }

    @GetMapping("")
    public String nattyChamp() {
        return "NATTY CHAAAAAAMP!!!!!!";
    }

    @GetMapping("/all-ncaa-champs")
    public List<Wrestler> allChamps() throws IOException {
        wrestlerService.loadWrestlers();
        return wrestlerService.allChamps();
    }

    @GetMapping("/weight-class")
    public List<Wrestler> getWeight() throws IOException {
        wrestlerService.loadWrestlers();
        return wrestlerService.filterByWeight("Heavyweight");
    }

    @GetMapping("/year")
    public List<Wrestler> getYear() throws IOException {
        wrestlerService.loadWrestlers();
        return wrestlerService.filterByYear("2007");
    }

    @GetMapping("/iowa")
    public List<Wrestler> getIowaCollege() throws IOException {
        wrestlerService.loadWrestlers();
        wrestlerService.yearSort();
        return wrestlerService.filterByCollege("Iowa");
    }
    @GetMapping("/pennst")
    public List<Wrestler> getPennStCollege() throws IOException {
        wrestlerService.loadWrestlers();
        wrestlerService.weightSort();
        return wrestlerService.filterByCollege("Penn St.");
    }
}
