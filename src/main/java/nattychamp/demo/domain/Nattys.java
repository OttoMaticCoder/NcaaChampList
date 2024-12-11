package nattychamp.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nattys {
    public Long nattyId;
    public String nattyName;
    public String titles;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getNattyId() {
        return nattyId;
    }

    public void setNattyId(Long nattyId) {
        this.nattyId = nattyId;
    }

    public String getNattyName() {
        return nattyName;
    }

    public void setNattyName(String nattyName) {
        this.nattyName = nattyName;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
