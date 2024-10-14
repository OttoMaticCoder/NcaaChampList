package service;

import wrestler.Wrestler;

public class CollegeSortService {
    private Wrestler[] wrestlers;

public CollegeSortService(FileService fileService) {
    wrestlers = fileService.readWrestlerList();
}

public Wrestler[] sortBySchool(String college) {
    int champCount = countChampsInList(college);
    Wrestler[] collegeWrestler = new Wrestler[champCount];
    int counter = 0;
    for (Wrestler wrestler : wrestlers) {
        if (wrestler.getSchool().contains(college)) {
            collegeWrestler[counter++] = wrestler;
        }
    }
    return collegeWrestler;
}



private int countChampsInList(String college) {
    int count = 0;
    for (Wrestler wrestler : wrestlers) {
        if (wrestler.getSchool().contains(college)) {
            count++;
        }
    }
    return count;
}



}
