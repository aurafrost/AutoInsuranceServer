package com.auto_insurance.springbootwebsetup.dao;

import com.auto_insurance.springbootwebsetup.model.Claim;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimDao extends CrudRepository<Claim, Integer> {
    Claim findById(int id);
}
