package com.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.report.entity.PurchaseReport;

public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Long> {
}
