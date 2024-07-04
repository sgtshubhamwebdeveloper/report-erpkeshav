package com.report.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.report.entity.SaleReport;
import com.report.repository.SaleReportRepository;

@Service
public class SaleReportService  {
    @Autowired
    private SaleReportRepository saleReportRepository;
    public List<SaleReport> getSaleReports() {
        return saleReportRepository.findAll();
    }
    public SaleReport getSaleReportById(Long id) {
        return saleReportRepository.findById(id).orElseThrow();
    }
    public void saveSaleReport(SaleReport saleReport) {
        saleReportRepository.save(saleReport);
    }
}