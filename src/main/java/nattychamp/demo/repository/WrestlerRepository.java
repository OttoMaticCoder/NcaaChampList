package nattychamp.demo.repository;

import nattychamp.demo.domain.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WrestlerRepository extends JpaRepository<Wrestler, Long> {

    List<Wrestler> findByCollege (String college);
    List<Wrestler> findByWeight (String weight);
    List<Wrestler> findByCollegeAndWeight (String college, String weight);


}
