package com.auto_insurance.dao;

import com.auto_insurance.model.Claim;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimDao extends CrudRepository<Claim, Integer> {
    Claim findByClaimId(int claimId);
    Claim deleteByClaimId(int claimId);
}
