package com.auto_insurance.springbootwebsetup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {

    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "type")
    private String type;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "password")
    private String password;

    public User() { }

    public User(String email, String type, String fname, String lname, String password) {
        this.email = email;
        this.type = type;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
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
