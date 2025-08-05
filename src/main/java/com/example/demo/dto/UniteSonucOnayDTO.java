package com.example.demo.dto;

import java.time.LocalDateTime;

public class UniteSonucOnayDTO {

    private Integer sonucOnayId;
    private Integer donemNo;
    private Integer persDonemId;
    private String uniteKod;
    private Boolean durum;
    private String oper;
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getSonucOnayId() {
        return sonucOnayId;
    }

    public void setSonucOnayId(Integer sonucOnayId) {
        this.sonucOnayId = sonucOnayId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public Integer getPersDonemId() {
        return persDonemId;
    }

    public void setPersDonemId(Integer persDonemId) {
        this.persDonemId = persDonemId;
    }

    public String getUniteKod() {
        return uniteKod;
    }

    public void setUniteKod(String uniteKod) {
        this.uniteKod = uniteKod;
    }

    public Boolean getDurum() {
        return durum;
    }

    public void setDurum(Boolean durum) {
        this.durum = durum;
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
