package main;

import service.FileService;
import service.CollegeSortService;
import service.WeightSortService;
import service.WrestlerReportService;

public class NattyChampClass {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        CollegeSortService sortService = new CollegeSortService(fileService);
        WeightSortService weightSortService = new WeightSortService(fileService);
        WrestlerReportService reportService = new WrestlerReportService(fileService, sortService);
        WrestlerReportService weightReportService = new WrestlerReportService(fileService, weightSortService);

        weightReportService.generateWrestlerWeightList("157", "157-Champs");

//        reportService.generateWrestlerList("Penn St.", "Penn-St-Wrestlers-csv");
//        reportService.generateWrestlerList("Cornell", "Cornell-Wrestlers-csv");
//        reportService.generateWrestlerList("Iowa St.", "Iowa-St-Wrestlers-csv");
//        reportService.generateWrestlerList("Oklahoma St.", "Oklahoma-St-csv");



    }
}