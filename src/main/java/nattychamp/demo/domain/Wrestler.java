package nattychamp.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Scanner;

@Entity
public class Wrestler {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wrestler_Id;
    private String year;
    private String name;
    private String college;
    private String weight;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getWrestler_Id() {
        return wrestler_Id;
    }

    public void setWrestler_Id(Long wrestler_Id) {
        this.wrestler_Id = wrestler_Id;
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
