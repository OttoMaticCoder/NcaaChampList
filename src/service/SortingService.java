package service;

import wrestler.Wrestler;

import java.util.Arrays;

public class SortingService {
    private Wrestler[] wrestlers;

    public SortingService(FileService fileService) {
        wrestlers = fileService.readWrestlerList();
    }

    public Wrestler[] sortBySchool(String college) {
        return Arrays.stream(wrestlers)
                     .filter(wrestler -> wrestler.getSchool().contains(college))
                     .toArray(Wrestler[]::new);

    }

    public Wrestler[] sortByWeight(String weight) {
        return Arrays.stream(wrestlers)
                     .filter(wrestler -> wrestler.getSchool().contains(weight))
                     .toArray(Wrestler[]::new);
    }

    public Wrestler[] sortByNattys(String nattys) {
        return Arrays.stream(wrestlers)
                     .filter(wrestler -> wrestler.getNattys().contains(nattys))
                     .toArray(Wrestler[]::new);
    }
}
