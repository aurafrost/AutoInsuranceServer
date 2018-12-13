package com.auto_insurance.controller;

import com.auto_insurance.dao.ReportDao;
import com.auto_insurance.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/report")
public class ReportController {

    @Autowired
    ReportDao reportDao;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<Report>> getAllReports() {
        List<Report> list = reportDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
