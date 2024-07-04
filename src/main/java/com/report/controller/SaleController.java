package com.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.entity.SaleReport;
import com.report.service.SaleReportService;

@RestController
@RequestMapping("/api/sale")
public class SaleController {
    
    @Autowired
    private SaleReportService saleReportService;
    @GetMapping("/reports")
    public List<SaleReport> getSaleReports() {
        return saleReportService.getSaleReports();
    }
    @GetMapping("/{id}")
    public SaleReport getSaleReport(@PathVariable Long id) {
        return saleReportService.getSaleReportById(id);
    }
    @PostMapping("/save")
    public void saveSaleReport(@RequestBody SaleReport saleReport) {
        saleReportService.saveSaleReport(saleReport);
    }
}