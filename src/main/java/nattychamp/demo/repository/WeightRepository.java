package nattychamp.demo.repository;

import nattychamp.demo.domain.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeightRepository extends JpaRepository<Weight, Long> {
//    List<Weight> findByWeightClass (Double weight);
    Optional<Weight> findByWeightId (Long id);



}
