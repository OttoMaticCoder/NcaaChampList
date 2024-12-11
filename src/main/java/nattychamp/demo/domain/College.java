package nattychamp.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
    public Long collegeId;
    public String collegeName;
    public Integer champCount;

    public Integer getChampCount() {
        return champCount;
    }

    public void setChampCount(Integer champCount) {
        this.champCount = champCount;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }
}
