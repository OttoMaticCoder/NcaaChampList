package service;

import wrestler.Wrestler;

public class WrestlerReportService {
    private FileService fileService;
    private SortService sortService;

    public WrestlerReportService(FileService fileService, SortService sortService) {
        this.fileService = fileService;
        this.sortService = sortService;
    }

    public void generateWrestlerList(String college, String fileName) {
        Wrestler[] collegeWrestler = sortService.sortBySchool(college);
        sortService.sortBySchool(college);
        fileService.writeToFile(collegeWrestler, fileName);

    }


}
