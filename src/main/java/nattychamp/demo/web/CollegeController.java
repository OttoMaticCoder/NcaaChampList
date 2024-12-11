package nattychamp.demo.web;

import nattychamp.demo.domain.College;
import nattychamp.demo.service.CollegeService;
import nattychamp.demo.service.WrestlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("college/")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @Autowired
    public CollegeController (CollegeService collegeService) {
        this.collegeService = collegeService;
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


}
