package com.auto_insurance.model;

import javax.persistence.*;

@Entity
@Table(name = "CLAIM_TABLE")
public class Claim {
    @Id
    @GeneratedValue
    @Column(name = "claim_id")
    private int claim_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "policy_no")
    private String policy_no;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_id")
    private Report report; // FK -> Report

    @Column(name = "status")
    private String status;

    @Column(name = "other_driverLicense")
    private String other_driverLicense;

    @Column(name = "car_model")
    private String car_model;
    @Column(name = "car_make")
    private String car_make;

    @Column(name = "date_of_incident")
    private String date_of_incident;
    @Column(name = "description")
    private String description;
    @Column(name = "estimate_cost_repairs")
    private double estimate_cost_repairs;

    public Claim() {}

    public Claim(User user, String policy_no, Report report, String status, String other_driverLicense, String car_model, String car_make, String date_of_incident, String description, double estimate_cost_repairs) {
        this.user = user;
        this.policy_no = policy_no;
        this.report = report;
        this.status = status;
        this.other_driverLicense = other_driverLicense;
        this.car_model = car_model;
        this.car_make = car_make;
        this.date_of_incident = date_of_incident;
        this.description = description;
        this.estimate_cost_repairs = estimate_cost_repairs;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Report getReport() {
        return report;
    }

    public void setClaim_id(int claim_id) {
        this.claim_id = claim_id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPolicy_no(String policy_no) {
        this.policy_no = policy_no;
    }

//    public void setReport(Report report) {
//        this.report = report;
//    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOther_driverLicense(String other_driverLicense) {
        this.other_driverLicense = other_driverLicense;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_make(String car_make) {
        this.car_make = car_make;
    }

    public void setDate_of_incident(String date_of_incident) {
        this.date_of_incident = date_of_incident;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEstimate_cost_repairs(double estimate_cost_repairs) {
        this.estimate_cost_repairs = estimate_cost_repairs;
    }

    public int getClaim_id() {
        return claim_id;
    }

    public User getUser() {
        return user;
    }

    public String getPolicy_no() {
        return policy_no;
    }

//    public Report getReport() {
//        return report;
//    }

    public String getStatus() {
        return status;
    }

    public String getOther_driverLicense() {
        return other_driverLicense;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getCar_make() {
        return car_make;
    }

    public String getDate_of_incident() {
        return date_of_incident;
    }

    public String getDescription() {
        return description;
    }

    public double getEstimate_cost_repairs() {
        return estimate_cost_repairs;
    }
}
