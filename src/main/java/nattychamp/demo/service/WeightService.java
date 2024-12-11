package nattychamp.demo.service;

import nattychamp.demo.domain.Weight;
import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.repository.WeightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightService {
    private WeightRepository weightRepo;

    public List<Weight> findByCollege(String weight) {
        return weightRepo.findByWeightClass(weight);
    }

}
