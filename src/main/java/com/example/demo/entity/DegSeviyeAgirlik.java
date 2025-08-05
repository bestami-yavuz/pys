package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_deg_seviye_agirlik_tbl")
public class DegSeviyeAgirlik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEG_SEVIYE_NO")
    private Integer degSeviyeNo;

    @Column(name = "SEVIYE_ID")
    private Integer seviyeId; 

    @Column(name = "DEGERLENDIRICI_SEVIYE_ID")
    private Integer degerlendiriciSeviyeId;

    @Column(name = "AGIRLIK_AMIR", precision = 5, scale = 2)
    private BigDecimal agirlikAmir;

    @Column(name = "AGIRLIK_AMIR_DEGIL", precision = 5, scale = 2)
    private BigDecimal agirlikAmirDegil;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

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

    public BigDecimal getAgirlikAmir() {
        return agirlikAmir;
    }

    public void setAgirlikAmir(BigDecimal agirlikAmir) {
        this.agirlikAmir = agirlikAmir;
    }

    public BigDecimal getAgirlikAmirDegil() {
        return agirlikAmirDegil;
    }

    public void setAgirlikAmirDegil(BigDecimal agirlikAmirDegil) {
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
