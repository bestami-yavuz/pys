package com.example.demo.dto;

import java.time.LocalDateTime;

public class OrgDTO {

    private Integer orgId;        // <-- eksik olan alan buydu
    private Integer donemNo;
    private String orgKod;
    private String orgAd;
    private String seviyeKod;
    private String ustOrgKod;
    private String oper;
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getOrgKod() {
        return orgKod;
    }

    public void setOrgKod(String orgKod) {
        this.orgKod = orgKod;
    }

    public String getOrgAd() {
        return orgAd;
    }

    public void setOrgAd(String orgAd) {
        this.orgAd = orgAd;
    }

    public String getSeviyeKod() {
        return seviyeKod;
    }

    public void setSeviyeKod(String seviyeKod) {
        this.seviyeKod = seviyeKod;
    }

    public String getUstOrgKod() {
        return ustOrgKod;
    }

    public void setUstOrgKod(String ustOrgKod) {
        this.ustOrgKod = ustOrgKod;
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
