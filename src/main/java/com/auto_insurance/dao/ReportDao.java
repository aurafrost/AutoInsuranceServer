package com.auto_insurance.dao;

import com.auto_insurance.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportDao extends CrudRepository<Report, Integer> {
    Report findByReportId(int reportId);

    List<Report> findAll();

    Report deleteByReportId(int reportId);
}
