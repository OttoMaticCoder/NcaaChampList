package nattychamp.demo.service;

import nattychamp.demo.domain.College;
import nattychamp.demo.domain.Weight;
import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.repository.WeightRepository;
import nattychamp.demo.repository.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeightService {
    @Autowired
    private WeightRepository weightRepo;

//    @Autowired
//    private WrestlerRepository wrestlerRepository;


//    public List<Weight> findByCollege(Double weight) {
//        return weightRepo.findByWeightClass(weight);
//    }

    public List<Weight> findAll() {
        return weightRepo.findAll();
    }

    public Weight findOne(Long weightId) {
        Optional<Weight> weightOpt = weightRepo.findByWeightId(weightId);
        return weightOpt.orElse(new Weight());
    }





}
