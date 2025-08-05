package com.example.demo.dto;

import java.time.LocalDateTime;

public class HarfSkalaTanimDto {


    private Integer harfSkalaTanimNo;
    private String tesis;
    private String ad;
    private String durum;
    private String oper;
    private LocalDateTime saat;

    // Getter Setter

    public Integer getHarfSkalaTanimNo() {
        return harfSkalaTanimNo;
    }

    public void setHarfSkalaTanimNo(Integer harfSkalaTanimNo) {
        this.harfSkalaTanimNo = harfSkalaTanimNo;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public LocalDateTime getSaat() {
        return saat;
    }

    public void setSaat(LocalDateTime saat) {
        this.saat = saat;
    }
}
