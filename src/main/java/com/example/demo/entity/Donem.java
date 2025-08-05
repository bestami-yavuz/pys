package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_DONEM_TBL")
public class Donem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DONEM_NO")
    private Integer donemNo;

    @Column(name = "TESIS")
    private Integer tesis;

    @Column(name = "DONEM_ADI", length = 20)
    private String donemAdi;

    @Column(name = "CAL_TIP", length = 1)
    private String calTip;

    @Column(name = "DONEM_BASLAMA")
    @Temporal(TemporalType.DATE)
    private Date donemBaslama;

    @Column(name = "DONEM_BITIS")
    @Temporal(TemporalType.DATE)
    private Date donemBitis;

    @Column(name = "SAP_TRANSFER_TARIHI")
    @Temporal(TemporalType.DATE)
    private Date sapTransferTarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SKALA_TANIM_NO", referencedColumnName = "SKALA_TANIM_NO")
    private SkalaTanim skalaTanim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HARF_SKALA_TANIM_NO", referencedColumnName = "HARF_SKALA_TANIM_NO")
    private HarfSkalaTanim harfSkalaTanim;

    @Column(name = "MIN_CAL_SURE")
    private Integer minCalSure;

    @Column(name = "MAX_PUAN_FARKI")
    private Integer maxPuanFarki;

    @Column(name = "DONEM_DURUM")
    private Byte donemDurum;

    @Column(name = "TOPLAM_PUAN")
    private Integer toplamPuan;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    @Column(name = "SAP_TRANS_GER_TARIHI")
    @Temporal(TemporalType.DATE)
    private Date sapTransGerTarihi;

    @Column(name = "BEKLEME_ONC_DURUM")
    private Byte beklemeOncDurum;

    // Getter ve Setterlar

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public Integer getTesis() {
        return tesis;
    }

    public void setTesis(Integer tesis) {
        this.tesis = tesis;
    }

    public String getDonemAdi() {
        return donemAdi;
    }

    public void setDonemAdi(String donemAdi) {
        this.donemAdi = donemAdi;
    }

    public String getCalTip() {
        return calTip;
    }

    public void setCalTip(String calTip) {
        this.calTip = calTip;
    }

    public Date getDonemBaslama() {
        return donemBaslama;
    }

    public void setDonemBaslama(Date donemBaslama) {
        this.donemBaslama = donemBaslama;
    }

    public Date getDonemBitis() {
        return donemBitis;
    }

    public void setDonemBitis(Date donemBitis) {
        this.donemBitis = donemBitis;
    }

    public Date getSapTransferTarihi() {
        return sapTransferTarihi;
    }

    public void setSapTransferTarihi(Date sapTransferTarihi) {
        this.sapTransferTarihi = sapTransferTarihi;
    }

    public SkalaTanim getSkalaTanim() {
        return skalaTanim;
    }

    public void setSkalaTanim(SkalaTanim skalaTanim) {
        this.skalaTanim = skalaTanim;
    }

    public HarfSkalaTanim getHarfSkalaTanim() {
        return harfSkalaTanim;
    }

    public void setHarfSkalaTanim(HarfSkalaTanim harfSkalaTanim) {
        this.harfSkalaTanim = harfSkalaTanim;
    }

    public Integer getMinCalSure() {
        return minCalSure;
    }

    public void setMinCalSure(Integer minCalSure) {
        this.minCalSure = minCalSure;
    }

    public Integer getMaxPuanFarki() {
        return maxPuanFarki;
    }

    public void setMaxPuanFarki(Integer maxPuanFarki) {
        this.maxPuanFarki = maxPuanFarki;
    }

    public Byte getDonemDurum() {
        return donemDurum;
    }

    public void setDonemDurum(Byte donemDurum) {
        this.donemDurum = donemDurum;
    }

    public Integer getToplamPuan() {
        return toplamPuan;
    }

    public void setToplamPuan(Integer toplamPuan) {
        this.toplamPuan = toplamPuan;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public Date getOperSaat() {
        return operSaat;
    }

    public void setOperSaat(Date operSaat) {
        this.operSaat = operSaat;
    }

    public Date getSapTransGerTarihi() {
        return sapTransGerTarihi;
    }

    public void setSapTransGerTarihi(Date sapTransGerTarihi) {
        this.sapTransGerTarihi = sapTransGerTarihi;
    }

    public Byte getBeklemeOncDurum() {
        return beklemeOncDurum;
    }

    public void setBeklemeOncDurum(Byte beklemeOncDurum) {
        this.beklemeOncDurum = beklemeOncDurum;
    }
}
