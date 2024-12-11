package nattychamp.demo.repository;

import nattychamp.demo.domain.College;
import nattychamp.demo.domain.Wrestler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    List<College> findByCollegeId (Long college);
    List<College> findByChampCount(Integer champCount);
    List<College> findByCollegeName(String champCount);


}
