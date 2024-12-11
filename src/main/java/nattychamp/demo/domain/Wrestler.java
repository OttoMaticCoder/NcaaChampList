package nattychamp.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wrestler {
    private Long wrestlerId;
    private String year;
    private String name;
    private String college;
    private String weight;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getWrestlerId() {
        return wrestlerId;
    }

    public void setWrestlerId(Long wrestlerId) {
        this.wrestlerId = wrestlerId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return  year + "," +
                name + "," +
                college + "," +
                weight;
    }
}
