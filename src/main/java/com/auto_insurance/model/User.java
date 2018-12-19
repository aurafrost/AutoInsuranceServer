package com.auto_insurance.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER_TABLE")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "userId")
    private int userId;

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
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "status")
    private String status;
    @Column(name = "policyNo")
    private String policyNo;

    public User() { }

    public User(String email, String policyNo, List<Claim> claim, String password, String type, String fname, String lname, String phone, String address, String status) {
        this.email = email;
        this.policyNo = policyNo;
        this.claim = claim;
        this.password = password;
        this.type = type;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClaim(List<Claim> claim) {
        this.claim = claim;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public List<Claim> getClaim() {
        return claim;
    }

    public String getPassword() {
        return password;
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

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}