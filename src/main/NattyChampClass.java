package main;

import service.FileService;
import service.SortingService;
import service.WrestlerReportService;

public class NattyChampClass {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        SortingService sortService = new SortingService(fileService);

        WrestlerReportService schoolReportService = new WrestlerReportService(fileService, sortService);
        WrestlerReportService weightReportService = new WrestlerReportService(fileService, sortService);

//        weightReportService.generateWrestlerWeightList("157", "157-Champs");
        schoolReportService.generateWrestlerSchoolList(" Iowa", "IowaChamps");


//        reportService.generateWrestlerList("Penn St.", "Penn-St-Wrestlers-csv");
//        reportService.generateWrestlerList("Cornell", "Cornell-Wrestlers-csv");
//        reportService.generateWrestlerList("Iowa St.", "Iowa-St-Wrestlers-csv");
//        reportService.generateWrestlerList("Oklahoma St.", "Oklahoma-St-csv");



    }
}