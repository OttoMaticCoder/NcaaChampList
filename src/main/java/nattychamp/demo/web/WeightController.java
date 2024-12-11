package nattychamp.demo.web;

import nattychamp.demo.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("weight/")
public class WeightController {
    @Autowired
    private WeightService weightService;
    @Autowired
    public WeightController (WeightService weightService) {
        this.weightService = weightService;
    }

    @GetMapping("")
    public String allWeightClasses() {
        return "weights";
    }


}
