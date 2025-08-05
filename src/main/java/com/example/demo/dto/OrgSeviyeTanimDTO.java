package com.example.demo.dto;

import java.time.LocalDateTime;

public class OrgSeviyeTanimDTO {

    private Integer orgSeviyeId;
    private Integer donemNo;
    private String orgSeviyeKod;
    private String orgSeviyeAd;
    private String oper;
    private LocalDateTime operSaat;

    // Getter & Setter metodları

    public Integer getOrgSeviyeId() {
        return orgSeviyeId;
    }

    public void setOrgSeviyeId(Integer orgSeviyeId) {
        this.orgSeviyeId = orgSeviyeId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getOrgSeviyeKod() {
        return orgSeviyeKod;
    }

    public void setOrgSeviyeKod(String orgSeviyeKod) {
        this.orgSeviyeKod = orgSeviyeKod;
    }

    public String getOrgSeviyeAd() {
        return orgSeviyeAd;
    }

    public void setOrgSeviyeAd(String orgSeviyeAd) {
        this.orgSeviyeAd = orgSeviyeAd;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public LocalDateTime getOperSaat() {
        return operSaat;
    }

    public void setOperSaat(LocalDateTime operSaat) {
        this.operSaat = operSaat;
    }
}
