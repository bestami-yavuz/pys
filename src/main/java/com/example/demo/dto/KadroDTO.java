package com.example.demo.dto;

import java.time.LocalDateTime;

public class KadroDTO {

    private Integer kadroId;
    private Integer donemNo;
    private String pozKod;
    private String pozAd;
    private String orgKod;
    private String uniteKod;
    private String oper;
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getKadroId() {
        return kadroId;
    }

    public void setKadroId(Integer kadroId) {
        this.kadroId = kadroId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getPozKod() {
        return pozKod;
    }

    public void setPozKod(String pozKod) {
        this.pozKod = pozKod;
    }

    public String getPozAd() {
        return pozAd;
    }

    public void setPozAd(String pozAd) {
        this.pozAd = pozAd;
    }

    public String getOrgKod() {
        return orgKod;
    }

    public void setOrgKod(String orgKod) {
        this.orgKod = orgKod;
    }

    public String getUniteKod() {
        return uniteKod;
    }

    public void setUniteKod(String uniteKod) {
        this.uniteKod = uniteKod;
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
