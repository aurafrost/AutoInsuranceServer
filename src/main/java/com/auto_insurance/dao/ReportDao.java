package com.auto_insurance.dao;

import com.auto_insurance.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDao extends CrudRepository<Report, Integer> {
    Report findByReportId(int reportId);

    Report deleteByReportId(int reportId);
}
