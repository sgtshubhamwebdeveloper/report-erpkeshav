package com.report.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.report.entity.PurchaseReport;
import com.report.repository.PurchaseReportRepository;

@Service
public class PurchaseReportService  {
    @Autowired
    private PurchaseReportRepository purchaseReportRepository;
    public List<PurchaseReport> getPurchaseReports() {
        return purchaseReportRepository.findAll();
    }
    public PurchaseReport getPurchaseReportById(Long id) {
        return purchaseReportRepository.findById(id).orElseThrow();
    }
    public void savePurchaseReport(PurchaseReport purchaseReport) {
        purchaseReportRepository.save(purchaseReport);
    }
} 