package com.auto_insurance.model;

import javax.persistence.*;

@Entity
@Table(name = "CLAIM_TABLE")
public class Claim {

    @Id
    @GeneratedValue
    @Column(name = "claimId")
    private int claimId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(name = "policyNo")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reportId")
    private Report report;

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
    @Column(name = "estimateCostRepairs")
    private double estimateCostRepairs;

    public Claim() {}

    public Claim(User user, Report report, String status, String otherDriverLicense, String carModel, String carMake, String dateOfIncident, String description, double estimateCostRepairs) {
        this.user = user;
        this.report = report;
        this.status = status;
        this.otherDriverLicense = otherDriverLicense;
        this.carModel = carModel;
        this.carMake = carMake;
        this.dateOfIncident = dateOfIncident;
        this.description = description;
        this.estimateCostRepairs = estimateCostRepairs;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setReport(Report report) {
        this.report = report;
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

    public void setEstimateCostRepairs(double estimateCostRepairs) {
        this.estimateCostRepairs = estimateCostRepairs;
    }

    public int getClaimId() {
        return claimId;
    }

    public User getUser() {
        return user;
    }

    public Report getReport() {
        return report;
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

    public double getEstimateCostRepairs() {
        return estimateCostRepairs;
    }
}