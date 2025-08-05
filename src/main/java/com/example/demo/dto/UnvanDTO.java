package com.example.demo.dto;

import java.time.LocalDateTime;

public class UnvanDTO {

    private Integer unvanId;
    private Integer donemNo;
    private String isKod;
    private String isAd;
    private String calTip;
    private Byte amirEh;
    private String oper;
    private LocalDateTime operSaat;

    // Getters & Setters

    public Integer getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(Integer unvanId) {
        this.unvanId = unvanId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getIsKod() {
        return isKod;
    }

    public void setIsKod(String isKod) {
        this.isKod = isKod;
    }

    public String getIsAd() {
        return isAd;
    }

    public void setIsAd(String isAd) {
        this.isAd = isAd;
    }

    public String getCalTip() {
        return calTip;
    }

    public void setCalTip(String calTip) {
        this.calTip = calTip;
    }

    public Byte getAmirEh() {
        return amirEh;
    }

    public void setAmirEh(Byte amirEh) {
        this.amirEh = amirEh;
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
