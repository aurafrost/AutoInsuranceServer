package com.auto_insurance.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER_TABLE")
public class User {

    @Id
    private String user_id;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Claim> claim;

    @Column(name = "password")
    private String password;
    @Column(name = "type")
    private String type;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "insured_phone")
    private String insured_phone;
    @Column(name = "insured_address")
    private String insured_address;
    @Column(name = "driver license")
    private String insured_driverLicense;
    @Column(name = "license_plate")
    private String insured_licensePlate;


    public User() { }

    public User(String user_id, String email, List<Claim> claim, String password, String type, String fname, String lname, String insured_phone, String insured_address, String insured_driverLicense, String insured_licensePlate) {
        this.user_id = user_id;
        this.email = email;
        this.claim = claim;
        this.password = password;
        this.type = type;
        this.fname = fname;
        this.lname = lname;
        this.insured_phone = insured_phone;
        this.insured_address = insured_address;
        this.insured_driverLicense = insured_driverLicense;
        this.insured_licensePlate = insured_licensePlate;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setClaim(List<Claim> claim) {
        this.claim = claim;
    }

    public void setInsured_phone(String insured_phone) {
        this.insured_phone = insured_phone;
    }

    public void setInsured_address(String insured_address) {
        this.insured_address = insured_address;
    }

    public void setInsured_driverLicense(String insured_driverLicense) {
        this.insured_driverLicense = insured_driverLicense;
    }

    public void setInsured_licensePlate(String insured_licensePlate) {
        this.insured_licensePlate = insured_licensePlate;
    }

    public String getUser_id() {
        return user_id;
    }

    public List<Claim> getClaim() {
        return claim;
    }

    public String getInsured_phone() {
        return insured_phone;
    }

    public String getInsured_address() {
        return insured_address;
    }

    public String getInsured_driverLicense() {
        return insured_driverLicense;
    }

    public String getInsured_licensePlate() {
        return insured_licensePlate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPassword() {
        return password;
    }
}
