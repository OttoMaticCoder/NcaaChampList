package service;

import wrestler.Wrestler;

public class WrestlerReportService {
    private FileService fileService;
    private CollegeSortService sortService;
    private WeightSortService weightSortService;

    public WrestlerReportService(FileService fileService, CollegeSortService sortService) {
        this.fileService = fileService;
        this.sortService = sortService;
    }

    public WrestlerReportService(FileService fileService, WeightSortService weightSortService) {
        this.fileService = fileService;
        this.weightSortService = weightSortService;
    }

    public void generateWrestlerSchoolList(String college, String fileName) {
        Wrestler[] collegeWrestler = sortService.sortBySchool(college);
        sortService.sortBySchool(college);
        fileService.writeToFile(collegeWrestler, fileName);

    }

    public void generateWrestlerWeightList(String weight, String fileName) {
        Wrestler[] collegeWrestler = weightSortService.sortByWeight(weight);
        weightSortService.sortByWeight(weight);
        fileService.writeToFile(collegeWrestler, fileName);

    }


}
