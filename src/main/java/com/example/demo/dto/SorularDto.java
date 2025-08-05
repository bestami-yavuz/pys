package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SorularDto {

    private Integer soruId;
    private Integer kadroId;
    private Integer soruNo;
    private String soru;
    private String soruAciklama;
    private BigDecimal soruPuan;
    private String tip;
    private String oper;
    private LocalDateTime operSaat;

    // GETTER - SETTER

    public Integer getSoruId() {
        return soruId;
    }

    public void setSoruId(Integer soruId) {
        this.soruId = soruId;
    }

    public Integer getKadroId() {
        return kadroId;
    }

    public void setKadroId(Integer kadroId) {
        this.kadroId = kadroId;
    }

    public Integer getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(Integer soruNo) {
        this.soruNo = soruNo;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getSoruAciklama() {
        return soruAciklama;
    }

    public void setSoruAciklama(String soruAciklama) {
        this.soruAciklama = soruAciklama;
    }

    public BigDecimal getSoruPuan() {
        return soruPuan;
    }

    public void setSoruPuan(BigDecimal soruPuan) {
        this.soruPuan = soruPuan;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
