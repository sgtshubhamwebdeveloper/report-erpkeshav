package com.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.entity.PurchaseReport;
import com.report.service.PurchaseReportService;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController{
    
	@Autowired
    private PurchaseReportService purchaseReportService;
    @GetMapping("/reports")
    public List<PurchaseReport> getPurchaseReports() {
        return purchaseReportService.getPurchaseReports();
    }
    @GetMapping("/{id}")
    public PurchaseReport getPurchaseReport(@PathVariable Long id) {
        return purchaseReportService.getPurchaseReportById(id);
    }
    @PostMapping("/save")
    public void savePurchaseReport(@RequestBody PurchaseReport purchaseReport) {
        purchaseReportService.savePurchaseReport(purchaseReport);
    }
}