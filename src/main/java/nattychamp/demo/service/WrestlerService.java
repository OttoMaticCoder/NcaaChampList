package nattychamp.demo.service;

import nattychamp.demo.domain.Wrestler;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WrestlerService {
    private List<Wrestler> wrestlers = new ArrayList<>();

    public void loadWrestlers() throws IOException {
        if (!wrestlers.isEmpty()) return;
        Reader in = new FileReader("AllNCAAChampions.txt");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().withHeader().withEscape('\\').parse(in);
        for (CSVRecord record : records) {
            Wrestler wrestler = new Wrestler();

            wrestler.setYear((record.get(0)));
            wrestler.setName(record.get(1));
            wrestler.setCollege(record.get(2));
            wrestler.setWeight((record.get(3)));
            wrestlers.add(wrestler);
        }
    }

    public void weightSort() {
        wrestlers.sort(new WeightSortComparator());
    }

    public void yearSort() {
        wrestlers.sort(new YearSortComparator());
    }

    public List<Wrestler> filterByWeight(String weight) {
        return  wrestlers.stream()
                .filter(wrestler -> wrestler.getWeight().contains(weight))
                .collect(Collectors.toList());
    }

    public List<Wrestler> filterByCollege(String college) {
        return  wrestlers.stream()
                .filter(wrestler -> wrestler.getCollege().contains(college))
                .collect(Collectors.toList());
    }

    public List<Wrestler> filterByYear(String year) {
        return  wrestlers.stream()
                .filter(wrestler -> wrestler.getYear().contains(year))
                .collect(Collectors.toList());
    }

    public List<Wrestler> allChamps() {
        return wrestlers;
    }
}
