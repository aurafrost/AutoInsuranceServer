package com.auto_insurance.controller;

import com.auto_insurance.dao.ReportDao;
import com.auto_insurance.model.Claim;
import com.auto_insurance.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    ResponseEntity<List<Report>> getAllReport() {
        List<Report> list = reportDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Report> postReport(@RequestBody Report report) {
        Report r = reportDao.save(report);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
    
    //fix from here
    @RequestMapping(path = "/{reportId}", method = RequestMethod.GET)
    public ResponseEntity<Report> getReportById(@PathVariable int reportId) {
    	Report report = reportDao.findByReportId(reportId);
        return new ResponseEntity<>(report, HttpStatus.OK);
    }    

    @RequestMapping(path = "/{reportId}", method = RequestMethod.DELETE)
    public ResponseEntity<Report> deleteReportById(@PathVariable int reportId){
    	Report report = reportDao.deleteByReportId(reportId);
        return new ResponseEntity<>(report, HttpStatus.OK);
    }

    @RequestMapping(path = "/{reportId}", method = RequestMethod.PUT)
    public ResponseEntity<Report> updateReportById(@PathVariable int reportId, @RequestBody Report report){
        //TODO: Check if hibernate save overwrites the existing data
    	Report r = reportDao.save(report);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
}
