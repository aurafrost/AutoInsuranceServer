package com.auto_insurance.controller;

import com.auto_insurance.dao.ClaimDao;
import com.auto_insurance.dao.ReportDao;
import com.auto_insurance.model.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/claim")
public class ClaimController {
    @Autowired
    ClaimDao claimDao;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<Claim>> getAllClaims() {
        List<Claim> list = claimDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
