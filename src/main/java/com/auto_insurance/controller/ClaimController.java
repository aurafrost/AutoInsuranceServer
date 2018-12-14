package com.auto_insurance.controller;

import com.auto_insurance.dao.ClaimDao;
import com.auto_insurance.model.Claim;
import com.auto_insurance.model.User;

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
@RequestMapping(path = "/claim")
public class ClaimController {

    @Autowired
    ClaimDao claimDao;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<Claim>> getAllClaim() {
        List<Claim> list = claimDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Claim> postClaim(@RequestBody Claim claim) {
        Claim c = claimDao.save(claim);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    
    //fix from here
    @RequestMapping(path = "/{claimId}", method = RequestMethod.GET)
    public ResponseEntity<Claim> getClaimById(@PathVariable int claimId) {
    	Claim claim = claimDao.findByClaimId(claimId);
        return new ResponseEntity<>(claim, HttpStatus.OK);
    }    

    @RequestMapping(path = "/{claimId}", method = RequestMethod.DELETE)
    public ResponseEntity<Claim> deleteClaimById(@PathVariable int claimId){
    	Claim claim = claimDao.deleteByClaimId(claimId);
        return new ResponseEntity<>(claim, HttpStatus.OK);
    }

    @RequestMapping(path = "/id/{claimId}", method = RequestMethod.PUT)
    public ResponseEntity<Claim> updateClaimById(@PathVariable int claimId, @RequestBody Claim claim){
        //TODO: Check if hibernate save overwrites the existing data
        Claim findClaim = claimDao.findByClaimId(claimId);
        findClaim.setStatus(claim.getStatus());
        findClaim.setOtherDriverLicense(claim.getOtherDriverLicense());
        findClaim.setCarModel(claim.getCarModel());
        findClaim.setCarMake(claim.getCarMake());
        findClaim.setDateOfIncident(claim.getDateOfIncident());
        findClaim.setDescription(claim.getDescription());
        findClaim.setEstimateCostRepairs(claim.getEstimateCostRepairs());
        Claim c = claimDao.save(findClaim);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}
