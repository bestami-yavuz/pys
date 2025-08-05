package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pys_harf_skala_tbl")
public class HarfSkala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HARF_SKALA_NO")
    private Integer harfSkalaNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HARF_SKALA_TANIM_NO", referencedColumnName = "HARF_SKALA_TANIM_NO")
    private HarfSkalaTanim harfSkalaTanim;

    @Column(name = "HARF_SKALA_SIRA_NO")
    private Integer harfSkalaSiraNo;

    @Column(name = "HARF_SKALA", length = 1)
    private String harfSkala;

    @Column(name = "DEGER1")
    private Double deger1;

    @Column(name = "KRITER1", length = 2)
    private String kriter1;

    @Column(name = "DEGER2")
    private Double deger2;

    @Column(name = "KRITER2", length = 2)
    private String kriter2;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private String operSaat;

    @Column(name = "ACIKLAMA", length = 50)
    private String aciklama;

    // Getter ve Setter metodları

    public Integer getHarfSkalaNo() {
        return harfSkalaNo;
    }

    public void setHarfSkalaNo(Integer harfSkalaNo) {
        this.harfSkalaNo = harfSkalaNo;
    }

    public HarfSkalaTanim getHarfSkalaTanim() {
        return harfSkalaTanim;
    }

    public void setHarfSkalaTanim(HarfSkalaTanim harfSkalaTanim) {
        this.harfSkalaTanim = harfSkalaTanim;
    }

    public Integer getHarfSkalaSiraNo() {
        return harfSkalaSiraNo;
    }

    public void setHarfSkalaSiraNo(Integer harfSkalaSiraNo) {
        this.harfSkalaSiraNo = harfSkalaSiraNo;
    }

    public String getHarfSkala() {
        return harfSkala;
    }

    public void setHarfSkala(String harfSkala) {
        this.harfSkala = harfSkala;
    }

    public Double getDeger1() {
        return deger1;
    }

    public void setDeger1(Double deger1) {
        this.deger1 = deger1;
    }

    public String getKriter1() {
        return kriter1;
    }

    public void setKriter1(String kriter1) {
        this.kriter1 = kriter1;
    }

    public Double getDeger2() {
        return deger2;
    }

    public void setDeger2(Double deger2) {
        this.deger2 = deger2;
    }

    public String getKriter2() {
        return kriter2;
    }

    public void setKriter2(String kriter2) {
        this.kriter2 = kriter2;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getOperSaat() {
        return operSaat;
    }

    public void setOperSaat(String operSaat) {
        this.operSaat = operSaat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
