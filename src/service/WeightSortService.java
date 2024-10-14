package service;

import wrestler.Wrestler;

public class WeightSortService {
    private Wrestler[] wrestlers;

    public WeightSortService(FileService fileService) {
        wrestlers = fileService.readWrestlerList();
    }

    public Wrestler[] sortByWeight(String weight) {
        int champCount = countChampsInList(weight);
        Wrestler[] collegeWrestler = new Wrestler[champCount];
        int counter = 0;
        for (Wrestler wrestler : wrestlers) {
            if (wrestler.getWeight().contains(weight)) {
                collegeWrestler[counter++] = wrestler;
            }
        }
            return collegeWrestler;
    }

    private int countChampsInList(String weight) {
        int count = 0;
        for (Wrestler wrestler : wrestlers) {
            if (wrestler.getWeight().contains(weight)) {
                count++;
            }
        }
        return count;
    }

}
