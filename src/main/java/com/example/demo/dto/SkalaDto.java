package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SkalaDto {

    private Integer skalaNo;
    private Integer skalaTanimNo; // sadece ID
    private Integer skalaSiraNo;
    private String skalaAciklama;
    private BigDecimal skalaAgirlik;
    private String oper;
    private LocalDateTime operSaat;

    // Getter - Setter'lar
    public Integer getSkalaNo() {
        return skalaNo;
    }

    public void setSkalaNo(Integer skalaNo) {
        this.skalaNo = skalaNo;
    }

    public Integer getSkalaTanimNo() {
        return skalaTanimNo;
    }

    public void setSkalaTanimNo(Integer skalaTanimNo) {
        this.skalaTanimNo = skalaTanimNo;
    }

    public Integer getSkalaSiraNo() {
        return skalaSiraNo;
    }

    public void setSkalaSiraNo(Integer skalaSiraNo) {
        this.skalaSiraNo = skalaSiraNo;
    }

    public String getSkalaAciklama() {
        return skalaAciklama;
    }

    public void setSkalaAciklama(String skalaAciklama) {
        this.skalaAciklama = skalaAciklama;
    }

    public BigDecimal getSkalaAgirlik() {
        return skalaAgirlik;
    }

    public void setSkalaAgirlik(BigDecimal skalaAgirlik) {
        this.skalaAgirlik = skalaAgirlik;
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
