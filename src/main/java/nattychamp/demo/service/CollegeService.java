package nattychamp.demo.service;

import nattychamp.demo.domain.College;
import nattychamp.demo.domain.Wrestler;
import nattychamp.demo.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    public List<College> findByChampCount(Integer champCount) {
        return collegeRepo.findByChampCount(champCount);
    }

    public List<College> findByCollegeName(String college) {
        return collegeRepo.findByCollegeName(college);
    }

    public List<College> findAll() {
        return collegeRepo.findAll();
    }

    public College findOne(Long collegeId) {
        Optional<College> userOpt = collegeRepo.findById(collegeId);
        return userOpt.orElse(new College());
    }

    }
