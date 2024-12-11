package nattychamp.demo.repository;

import nattychamp.demo.domain.Weight;
import nattychamp.demo.domain.Wrestler;

import java.util.List;

public interface WeightRepository {
    List<Weight> findByWeightClass (String weight);
    List<Weight> findByWeightId (String id);

}
