package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_unvan_tbl")
public class Unvan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNVAN_ID")
    private Integer unvanId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @Column(name = "IS_KOD", length = 8)
    private String isKod;

    @Column(name = "IS_AD", length = 100)
    private String isAd;

    @Column(name = "CAL_TIP", length = 1)
    private String calTip;

    @Column(name = "AMIR_EH")
    private Byte amirEh;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getters and Setters

    public Integer getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(Integer unvanId) {
        this.unvanId = unvanId;
    }

    public Donem getDonem() {
        return donem;
    }

    public void setDonem(Donem donem) {
        this.donem = donem;
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
