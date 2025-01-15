package nattychamp.demo.web;

import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.service.CollegeService;
import nattychamp.demo.service.WrestlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
public class ChampController {
    @Autowired
    private WrestlerService wrestlerService;
    @Autowired
    private CollegeService collegeService;



    @Autowired
    public ChampController (WrestlerService wrestlerService, CollegeService collegeService) {
        this.wrestlerService = wrestlerService;
        this.collegeService = collegeService;
    }

    @GetMapping("")
    public String nattyChamp() {
        return "nattyhome";
    }

    @GetMapping("/teams")
    public String nattyChampTeams() {
        return "teams";
    }

    @GetMapping("/wrestlers")
    public String getAllChamps(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findAll();
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
            return "wrestlers";
    }

    @GetMapping("/{college}")
    public String getChampsByPennSt(ModelMap model, @PathVariable String college) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("{wrestler.college}");
        model.put("wrestlers", Arrays.asList(college));
        model.put("wrestler", wrestlers);


        return "wrestlers";
    }

    @GetMapping("/iowa")
    public String getChampsByIowaSt(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("Iowa");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

    @GetMapping("/ohiost")
    public String getChampsByOhioSt(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("Ohio St.");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

    @GetMapping("/cornell")
    public String getChampsByCornell(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("Cornell");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

    @GetMapping("/iowast")
    public String getChampsByIowaState(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("Iowa St.");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

    @GetMapping("/illinois")
    public String getChampsByIllinois(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByCollege("Illinois");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

    @GetMapping("/weight")
    public String getChampsByWeights(ModelMap model) {
        List<Wrestler> wrestlers = wrestlerService.findByWeight("125");
        model.put("wrestlers", wrestlers);
        if (wrestlers.size() ==1) {
            model.put("wrestler", wrestlers.get(0));
        }
        return "wrestlers";
    }

//    @GetMapping("/weight-class")
//    public List<Wrestler> getWeight() throws IOException {
//        wrestlerService.loadWrestlers();
//        return wrestlerService.filterByWeight("285");
//    }
//
//    @GetMapping("/year")
//    public List<Wrestler> getYear() throws IOException {
//        wrestlerService.loadWrestlers();
//        return wrestlerService.filterByYear("2007");
//    }
//
//    @GetMapping("/iowa")
//    public List<Wrestler> getIowaCollege() throws IOException {
//        wrestlerService.loadWrestlers();
//        wrestlerService.yearSort();
//        return wrestlerService.filterByCollege("Iowa");
//    }
//    @GetMapping("/pennst")
//    public List<Wrestler> getPennStCollege() throws IOException {
//        wrestlerService.loadWrestlers();
//        wrestlerService.weightSort();
//        return wrestlerService.filterByCollege("Penn St.");
//    }
//    @GetMapping("/wrestlername")
//    public List<Wrestler> getWrestlerName() throws IOException {
//        wrestlerService.loadWrestlers();
//        wrestlerService.weightSort();
//        return wrestlerService.filterByName("Nick Suriano");
//    }
}
