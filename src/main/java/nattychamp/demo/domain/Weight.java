package nattychamp.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weight {
    public Long weightId;
    public Double weightClass;

    public Double getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(Double weightClass) {
        this.weightClass = weightClass;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getWeightId() {
        return weightId;
    }

    public void setWeightId(Long weightId) {
        this.weightId = weightId;
    }
}
