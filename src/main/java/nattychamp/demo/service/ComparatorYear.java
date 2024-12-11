package nattychamp.demo.service;

import nattychamp.demo.domain.Wrestler;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Wrestler> {
    @Override
    public int compare(Wrestler year1, Wrestler year2) {
        return year1.getYear().compareTo(year2.getYear());
    }
}
