package com.auto_insurance.springbootwebsetup.dao;

import com.auto_insurance.springbootwebsetup.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDao extends CrudRepository<Report, Integer> {
    Report findById(int id);
}
