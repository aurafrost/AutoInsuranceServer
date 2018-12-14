package com.auto_insurance.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REPORT_TABLE")
public class Report implements Serializable {

    @Id
    private int claimId;

    @OneToOne
    @JoinColumn(name = "claimId")
    @MapsId
    private Claim claim;

    @Column(name = "policyNo")
    private String policyNo;
    @Column(name = "insuredEmail")
    private String insuredEmail;
    @Column(name = "claimOfficer")
    private String claimOfficer;
    @Column(name = "inspectOfficer")
    private String inspectOfficer;
    @Column(name = "insuredPhone")
    private String insuredPhone;

    public Report(){}

    public Report(Claim claim, String policyNo, String insuredEmail, String claimOfficer, String inspectOfficer, String insuredPhone) {
        this.claim = claim;
        this.policyNo = policyNo;
        this.insuredEmail = insuredEmail;
        this.claimOfficer = claimOfficer;
        this.inspectOfficer = inspectOfficer;
        this.insuredPhone = insuredPhone;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
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

    public Claim getClaim() {
        return claim;
    }

    public String getPolicyNo() {
        return policyNo;
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
}