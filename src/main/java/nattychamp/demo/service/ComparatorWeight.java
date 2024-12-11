package nattychamp.demo.service;

import nattychamp.demo.domain.Wrestler;

import java.util.Comparator;

public class ComparatorWeight implements Comparator<Wrestler> {
    @Override
    public int compare(Wrestler weight1, Wrestler weight2) {
        return Double.compare(Double.parseDouble(weight2.getWeight()), Double.parseDouble(weight1.getWeight()));
    }
}
