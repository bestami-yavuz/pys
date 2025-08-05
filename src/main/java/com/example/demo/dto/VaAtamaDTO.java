package com.example.demo.dto;

import java.time.LocalDateTime;

public class VaAtamaDTO {

    private Integer vaAtamaId;  
    private Integer donemNo;
    private String calisanPerNo;
    private String vaPerNo;
    private Byte durum;
    private String oper;
    private LocalDateTime operSaat;

    public Integer getVaAtamaId() {
        return vaAtamaId;
    }

    public void setVaAtamaId(Integer vaAtamaId) {
        this.vaAtamaId = vaAtamaId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getCalisanPerNo() {
        return calisanPerNo;
    }

    public void setCalisanPerNo(String calisanPerNo) {
        this.calisanPerNo = calisanPerNo;
    }

    public String getVaPerNo() {
        return vaPerNo;
    }

    public void setVaPerNo(String vaPerNo) {
        this.vaPerNo = vaPerNo;
    }

    public Byte getDurum() {
        return durum;
    }

    public void setDurum(Byte durum) {
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
