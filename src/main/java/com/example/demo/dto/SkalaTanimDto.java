package com.example.demo.dto;

import java.time.LocalDateTime;

public class SkalaTanimDto {

    private Integer skalaTanimNo;
    private String tesis;
    private String skalaAdi;
    private String skalaDurum;
    private String oper;
    private LocalDateTime operSaat;

    // Getter ve Setter

    public Integer getSkalaTanimNo() {
        return skalaTanimNo;
    }

    public void setSkalaTanimNo(Integer skalaTanimNo) {
        this.skalaTanimNo = skalaTanimNo;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    public String getSkalaAdi() {
        return skalaAdi;
    }

    public void setSkalaAdi(String skalaAdi) {
        this.skalaAdi = skalaAdi;
    }

    public String getSkalaDurum() {
        return skalaDurum;
    }

    public void setSkalaDurum(String skalaDurum) {
        this.skalaDurum = skalaDurum;
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
