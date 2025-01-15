package nattychamp.demo.domain;

import jakarta.persistence.*;

@Entity
public class Natty {
    public Long nattyId;
    public String nattyName;
    public String titles;
    public Wrestler wrestler;


    @OneToOne
    @MapsId
    @JoinColumn(name = "nattyId")
    public Wrestler getWrestler() {
        return wrestler;
    }

    public void setWrestler(Wrestler wrestler) {
        this.wrestler = wrestler;
    }

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
