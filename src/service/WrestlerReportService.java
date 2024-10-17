package service;

import wrestler.Wrestler;

public class WrestlerReportService {
    private FileService fileService;
    private SortingService sortService;


    public WrestlerReportService(FileService fileService, SortingService sortService) {
        this.fileService = fileService;
        this.sortService = sortService;
    }

    public void generateWrestlerSchoolList(String college, String fileName) {
        Wrestler[] collegeWrestler = sortService.sortBySchool(college);
        sortService.sortBySchool(college);
        fileService.writeToFile(collegeWrestler, fileName);

    }

    public void generateWrestlerWeightList(String weight, String fileName) {
        Wrestler[] collegeWrestler = sortService.sortByWeight(weight);
        sortService.sortByWeight(weight);
        fileService.writeToFile(collegeWrestler, fileName);

    }


}
