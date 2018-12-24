package com.auto_insurance.model;

import javax.persistence.*;

@Entity
@Table(name = "REPORT_TABLE")
public class Report {

    @Id
    @Column(name = "reportId")
    private int reportId;

    @PrimaryKeyJoinColumn
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Claim claim;

    @Column(name = "insuredEmail")
    private String insuredEmail;
    @Column(name = "claimOfficer")
    private String claimOfficer;
    @Column(name = "inspectOfficer")
    private String inspectOfficer;
    @Column(name = "insuredPhone")
    private String insuredPhone;
    @Column(name = "estimate")
    private double estimate;
    @Column(name = "evaluation")
    private String evaluation;

    public Report(){}

    public Report(Claim claim, String insuredEmail, String claimOfficer, String inspectOfficer, String insuredPhone, double estimate, String evaluation) {
        this.claim = claim;
        this.insuredEmail = insuredEmail;
        this.claimOfficer = claimOfficer;
        this.inspectOfficer = inspectOfficer;
        this.insuredPhone = insuredPhone;
        this.estimate = estimate;
        this.evaluation = evaluation;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void setInsuredEmail(String insuredEmail) {
        this.insuredEmail = insuredEmail;
    }

    public void setClaimOfficer(String claimOfficer) {
        this.claimOfficer = claimOfficer;
    }

    public void setInspectOfficer(String inspectOfficer) {
        this.inspectOfficer = inspectOfficer;
    }

    public void setInsuredPhone(String insuredPhone) {
        this.insuredPhone = insuredPhone;
    }

    public void setEstimate(double estimate) {
        this.estimate = estimate;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public int getReportId() {
        return reportId;
    }

    public Claim getClaim() {
        return claim;
    }

    public String getInsuredEmail() {
        return insuredEmail;
    }

    public String getClaimOfficer() {
        return claimOfficer;
    }

    public String getInspectOfficer() {
        return inspectOfficer;
    }

    public String getInsuredPhone() {
        return insuredPhone;
    }

    public double getEstimate() {
        return estimate;
    }

    public String getEvaluation() {
        return evaluation;
    }
}