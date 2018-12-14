package com.auto_insurance.model;

import javax.persistence.*;

@Entity
@Table(name = "REPORT_TABLE")
public class Report {

    @Id
    @GeneratedValue
    @Column(name = "reportId")
    private Integer reportId;

    @OneToOne
    @JoinColumn(name = "reportId")
    private Claim claim;

    @Column(name = "policy_no")
    private String policy_no;
    @Column(name = "insured_email")
    private String insured_email;
    @Column(name = "claim_officer")
    private String claim_officer;
    @Column(name = "inspect_officer")
    private String inspect_officer;
    @Column(name = "insured_phone")
    private String insured_phone;

    public Report(){}

    public Report(Claim claim, String policy_no, String insured_email, String claim_officer, String inspect_officer, String insured_phone) {
        this.claim = claim;
        this.policy_no = policy_no;
        this.insured_email = insured_email;
        this.claim_officer = claim_officer;
        this.inspect_officer = inspect_officer;
        this.insured_phone = insured_phone;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void setPolicy_no(String policy_no) {
        this.policy_no = policy_no;
    }

    public void setInsured_email(String insured_email) {
        this.insured_email = insured_email;
    }

    public void setClaim_officer(String claim_officer) {
        this.claim_officer = claim_officer;
    }

    public void setInspect_officer(String inspect_officer) {
        this.inspect_officer = inspect_officer;
    }

    public void setInsured_phone(String insured_phone) {
        this.insured_phone = insured_phone;
    }

    public int getReport_id() {
        return reportId;
    }

    public Claim getClaim() {
        return claim;
    }

    public String getPolicy_no() {
        return policy_no;
    }

    public String getInsured_email() {
        return insured_email;
    }

    public String getClaim_officer() {
        return claim_officer;
    }

    public String getInspect_officer() {
        return inspect_officer;
    }

    public String getInsured_phone() {
        return insured_phone;
    }
}