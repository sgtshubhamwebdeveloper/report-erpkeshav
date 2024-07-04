package com.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.report.entity.SaleReport;

public interface SaleReportRepository extends JpaRepository<SaleReport, Long> {
}