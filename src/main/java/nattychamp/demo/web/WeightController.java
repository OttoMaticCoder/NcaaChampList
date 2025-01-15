package nattychamp.demo.web;

import nattychamp.demo.domain.College;
import nattychamp.demo.domain.Weight;
import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("weights")
public class WeightController {
    @Autowired
    private WeightService weightService;
    @Autowired
    public WeightController (WeightService weightService) {
        this.weightService = weightService;
    }

    @GetMapping("")
    public String allWeightClasses(ModelMap model) {
        List<Weight> weights = weightService.findAll();
        model.put("weight", weights);
        return "weights";
    }

    @GetMapping("/{weightId}")
    public String getOneUser (ModelMap modle, @PathVariable Long weightId) {
        Weight weight = weightService.findOne(weightId);
        modle.put("weights", Arrays.asList(weight));
        modle.put("weight", weight);
        return "weights";

    }


}
