package nattychamp.demo.web;

import nattychamp.demo.domain.College;
import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.service.CollegeService;
import nattychamp.demo.service.WrestlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;
    @Autowired
    private WrestlerService wrestlerService;

    @Autowired
    public CollegeController (CollegeService collegeService, WrestlerService wrestlerService) {
        this.collegeService = collegeService;
        this.wrestlerService = wrestlerService;
    }

    @GetMapping("")
    public String nattyChampTeams() {
        return "teams";
    }

    @GetMapping("/bychampcount")
    public String collegeByChampCount(ModelMap model) {
        List<College> colleges = collegeService.findAll();
        model.put("colleges", colleges);
        return "college";
    }

    @GetMapping("/{collegeId}")
    public String getOneUser (ModelMap modle, @PathVariable Long collegeId) {
        College college = collegeService.findOne(collegeId);
        modle.put("colleges", Arrays.asList(college));
        modle.put("college", college);
        return "college";
    }

//    @GetMapping("/{collegeName}")
//    public String getOneUser (ModelMap modle, @PathVariable String collegeName) {
//        College college = collegeService.findByCollegeName(collegeName);
//        modle.put("college", college);
//        return "college";
//    }

    @GetMapping("/allchamps/{wrestlerId}")
    public String getCollegeChampList (ModelMap modle, @PathVariable Long wrestlerId) {
        List<Wrestler> wrestler = wrestlerService.findByWrestlerId(wrestlerId);
        modle.put("wrestlers", Arrays.asList(wrestler));
        modle.put("wrestler", wrestler);
        return "wrestlers";
    }


}
