package nattychamp.demo;

import nattychamp.demo.domain.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WrestlerRepository extends JpaRepository<Wrestler, Long> {

    List<Wrestler> findByCollege (String college);
    List<Wrestler> findByWeight (String weight);
    List<Wrestler> findByCollegeAndWeight (String college, String weight);


}
