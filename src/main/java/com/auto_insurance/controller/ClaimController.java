package com.auto_insurance.controller;

import com.auto_insurance.dao.ClaimDao;
import com.auto_insurance.dao.UserDao;
import com.auto_insurance.model.Claim;

import com.auto_insurance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    @Autowired
    ClaimDao claimDao;

    @Autowired
    UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Claim>> getAllClaim() {
        List<Claim> list = (List<Claim>) claimDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @RequestMapping(path = "/{userId}", method = RequestMethod.POST)
    public ResponseEntity<Claim> postClaim(@PathVariable("userId") int userId, @RequestBody Claim claim) {
        System.out.println(claim.toString());

        User user = userDao.findByUserId(userId);
        claim.setUser(user);

        Claim c = claimDao.save(claim);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @RequestMapping(path = "/{claimId}", method = RequestMethod.GET)
    public ResponseEntity<Claim> getClaimById(@PathVariable int claimId) {
    	Claim claim = claimDao.findByClaimId(claimId);
        System.out.println(claim.getUser().getUserId());
        User user=claim.getUser();

        claim.setUser(user);
        return new ResponseEntity<>(claim, HttpStatus.OK);
    }    

    @RequestMapping(path = "/{claimId}", method = RequestMethod.DELETE)
    public ResponseEntity<Claim> deleteClaimById(@PathVariable int claimId){
    	Claim claim = claimDao.deleteByClaimId(claimId);
        return new ResponseEntity<>(claim, HttpStatus.OK);
    }

    @RequestMapping(path = "/{claimId}", method = RequestMethod.PUT)
    public ResponseEntity<Claim> updateClaimById(@PathVariable int claimId, @RequestBody Claim claim){
        //TODO: Check if hibernate save overwrites the existing data
        Claim findClaim = claimDao.findByClaimId(claimId);
        findClaim.setStatus(claim.getStatus());
        findClaim.setOtherDriverLicense(claim.getOtherDriverLicense());
        findClaim.setCarModel(claim.getCarModel());
        findClaim.setCarMake(claim.getCarMake());
        findClaim.setDateOfIncident(claim.getDateOfIncident());
        findClaim.setDescription(claim.getDescription());
        Claim c = claimDao.save(findClaim);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
}
