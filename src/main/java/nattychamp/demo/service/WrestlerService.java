package nattychamp.demo.service;

import nattychamp.demo.WrestlerRepository;
import nattychamp.demo.domain.Wrestler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WrestlerService {
    @Autowired
    WrestlerRepository wrestlerRepo;

    public List<Wrestler> findByCollege(String college) {
        return wrestlerRepo.findByCollege(college);
    }

    public List<Wrestler> findByWeight(String weight) {
        return wrestlerRepo.findByWeight(weight);
    }

    public List<Wrestler> findByCollegeAndWeight(String college, String weight) {
        return wrestlerRepo.findByCollegeAndWeight(college, weight);
    }

    public List<Wrestler> findAll() {
        return wrestlerRepo.findAll();
    }
}
