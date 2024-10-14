package main;

import service.FileService;
import service.SortService;
import service.WrestlerReportService;

public class NattyChampClass {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        SortService sortService = new SortService(fileService);
        WrestlerReportService reportService = new WrestlerReportService(fileService, sortService);

        reportService.generateWrestlerList("Penn St.", "Penn-St-Wrestlers-csv");
        reportService.generateWrestlerList("Cornell", "Cornell-Wrestlers-csv");
        reportService.generateWrestlerList("Iowa St.", "Iowa-St-Wrestlers-csv");
        reportService.generateWrestlerList("Oklahoma St.", "Oklahoma-St-csv");


    }
}