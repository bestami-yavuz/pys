package com.example.demo.dto;

import java.time.LocalDateTime;

public class DegSeviyeAgirlikDto {

    private Integer degSeviyeNo;
    private Integer seviyeId;
    private Integer degerlendiriciSeviyeId;
    private Double agirlikAmir;
    private Double agirlikAmirDegil;
    private String oper;
    private LocalDateTime operSaat;

    // Getter - Setter'lar

    public Integer getDegSeviyeNo() {
        return degSeviyeNo;
    }

    public void setDegSeviyeNo(Integer degSeviyeNo) {
        this.degSeviyeNo = degSeviyeNo;
    }

    public Integer getSeviyeId() {
        return seviyeId;
    }

    public void setSeviyeId(Integer seviyeId) {
        this.seviyeId = seviyeId;
    }

    public Integer getDegerlendiriciSeviyeId() {
        return degerlendiriciSeviyeId;
    }

    public void setDegerlendiriciSeviyeId(Integer degerlendiriciSeviyeId) {
        this.degerlendiriciSeviyeId = degerlendiriciSeviyeId;
    }

    public Double getAgirlikAmir() {
        return agirlikAmir;
    }

    public void setAgirlikAmir(Double agirlikAmir) {
        this.agirlikAmir = agirlikAmir;
    }

    public Double getAgirlikAmirDegil() {
        return agirlikAmirDegil;
    }

    public void setAgirlikAmirDegil(Double agirlikAmirDegil) {
        this.agirlikAmirDegil = agirlikAmirDegil;
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