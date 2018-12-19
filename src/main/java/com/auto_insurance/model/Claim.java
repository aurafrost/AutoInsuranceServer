package com.auto_insurance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CLAIM_TABLE")
public class Claim {

    @Id
    @GeneratedValue
    @Column(name = "claimId")
    private int claimId;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(name = "status")
    private String status;

    @Column(name = "otherDriverLicense")
    private String otherDriverLicense;

    @Column(name = "carModel")
    private String carModel;
    @Column(name = "carMake")
    private String carMake;

    @Column(name = "dateOfIncident")
    private String dateOfIncident;
    @Column(name = "description")
    private String description;

    public Claim() {}

    public Claim(User user, String status, String otherDriverLicense, String carModel, String carMake, String dateOfIncident, String description) {
        this.user = user;
        this.status = status;
        this.otherDriverLicense = otherDriverLicense;
        this.carModel = carModel;
        this.carMake = carMake;
        this.dateOfIncident = dateOfIncident;
        this.description = description;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOtherDriverLicense(String otherDriverLicense) {
        this.otherDriverLicense = otherDriverLicense;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setDateOfIncident(String dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClaimId() {
        return claimId;
    }

    public User getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public String getOtherDriverLicense() {
        return otherDriverLicense;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getDateOfIncident() {
        return dateOfIncident;
    }

    public String getDescription() {
        return description;
    }
}