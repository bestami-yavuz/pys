package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

import com.example.demo.entity.Donem;

@Entity
@Table(name = "PYS_PERSONEL_TBL")
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERS_ID")
    private Integer persId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @Column(name = "PER_NO")
    private String perNo;

    @Column(name = "AD")
    private String ad;

    @Column(name = "SOYAD")
    private String soyad;

    @Column(name = "KIMLIK_NO")
    private String kimlikNo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TEL_IS")
    private String telIs;

    @Column(name = "CAL_TIP")
    private String calTip;

    @Column(name = "IS_GIR_TARIH")
    private Date isGirTarih;
    @Column(name = "AMIR_EH")
    private Byte amirEh;

    @Column(name = "IS_KOD")
    private String isKod;

    @Column(name = "IS_AD")
    private String isAd;

    @Column(name = "POZISYON_KOD")
    private String pozisyonKod;

    @Column(name = "POZISYON_AD")
    private String pozisyonAd;

    @Column(name = "PER_ORG_KOD")
    private String perOrgKod;

    @Column(name = "PER_ORG_AD")
    private String perOrgAd;

    @Column(name = "UNITE_ORG_KOD")
    private String uniteOrgKod;

    @Column(name = "UNITE_ORG_AD")
    private String uniteOrgAd;

    @Column(name = "SEVIYE_KOD")
    private String seviyeKod;

    @Column(name = "GM_KOD")
    private String gmKod;

    @Column(name = "GM_AD")
    private String gmAd;

    @Column(name = "GMY_KOD")
    private String gmyKod;

    @Column(name = "GMY_AD")
    private String gmyAd;

    @Column(name = "GRPBAS_KOD")
    private String grpbasKod;

    @Column(name = "GRPBAS_AD")
    private String grpbasAd;

    @Column(name = "DIR_KOD")
    private String dirKod;

    @Column(name = "DIR_AD")
    private String dirAd;

    @Column(name = "MDR_KOD")
    private String mdrKod;

    @Column(name = "MDR_AD")
    private String mdrAd;

    @Column(name = "MDRYRD_KOD")
    private String mdryrdKod;

    @Column(name = "MDRYRD_AD")
    private String mdryrdAd;

    @Column(name = "BASSEF_KOD")
    private String bassefKod;

    @Column(name = "BASSEF_AD")
    private String bassefAd;

    @Column(name = "AMIRLIK_KOD")
    private String amirlikKod;

    @Column(name = "AMIRLIK_AD")
    private String amirlikAd;

    @Column(name = "PBFOR_KOD")
    private String pbforKod;

    @Column(name = "PBFOR_AD")
    private String pbforAd;

    @Column(name = "OPER")
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    @Column(name = "CALGRUP_KOD")
    private String calgrupKod;

    @Column(name = "CALGRUP_AD")
    private String calgrupAd;


    // Getters and Setters
    public Integer getPersId() { return persId; }
    public void setPersId(Integer persId) { this.persId = persId; }
    public Donem getDonem() { return donem; }
    public void setDonem(Donem donem) { this.donem = donem; }
    public String getPerNo() { return perNo; }
    public void setPerNo(String perNo) { this.perNo = perNo; }
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }
    public String getSoyad() { return soyad; }
    public void setSoyad(String soyad) { this.soyad = soyad; }
    public String getKimlikNo() { return kimlikNo; }
    public void setKimlikNo(String kimlikNo) { this.kimlikNo = kimlikNo; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelIs() { return telIs; }
    public void setTelIs(String telIs) { this.telIs = telIs; }
    public String getCalTip() { return calTip; }
    public void setCalTip(String calTip) { this.calTip = calTip; }
    public Date getIsGirTarih() { return isGirTarih; }
    public void setIsGirTarih(Date isGirTarih) { this.isGirTarih = isGirTarih; }
    public Byte getAmirEh() { return amirEh; }
    public void setAmirEh(Byte amirEh) { this.amirEh = amirEh; }
    public String getIsKod() { return isKod; }
    public void setIsKod(String isKod) { this.isKod = isKod; }
    public String getIsAd() { return isAd; }
    public void setIsAd(String isAd) { this.isAd = isAd; }
    public String getPozisyonKod() { return pozisyonKod; }
    public void setPozisyonKod(String pozisyonKod) { this.pozisyonKod = pozisyonKod; }
    public String getPozisyonAd() { return pozisyonAd; }
    public void setPozisyonAd(String pozisyonAd) { this.pozisyonAd = pozisyonAd; }
    public String getPerOrgKod() { return perOrgKod; }
    public void setPerOrgKod(String perOrgKod) { this.perOrgKod = perOrgKod; }
    public String getPerOrgAd() { return perOrgAd; }
    public void setPerOrgAd(String perOrgAd) { this.perOrgAd = perOrgAd; }
    public String getUniteOrgKod() { return uniteOrgKod; }
    public void setUniteOrgKod(String uniteOrgKod) { this.uniteOrgKod = uniteOrgKod; }
    public String getUniteOrgAd() { return uniteOrgAd; }
    public void setUniteOrgAd(String uniteOrgAd) { this.uniteOrgAd = uniteOrgAd; }
    public String getSeviyeKod() { return seviyeKod; }
    public void setSeviyeKod(String seviyeKod) { this.seviyeKod = seviyeKod; }
    public String getGmKod() { return gmKod; }
    public void setGmKod(String gmKod) { this.gmKod = gmKod; }
    public String getGmAd() { return gmAd; }
    public void setGmAd(String gmAd) { this.gmAd = gmAd; }
    public String getGmyKod() { return gmyKod; }
    public void setGmyKod(String gmyKod) { this.gmyKod = gmyKod; }
    public String getGmyAd() { return gmyAd; }
    public void setGmyAd(String gmyAd) { this.gmyAd = gmyAd; }
    public String getGrpbasKod() { return grpbasKod; }
    public void setGrpbasKod(String grpbasKod) { this.grpbasKod = grpbasKod; }
    public String getGrpbasAd() { return grpbasAd; }
    public void setGrpbasAd(String grpbasAd) { this.grpbasAd = grpbasAd; }
    public String getDirKod() { return dirKod; }
    public void setDirKod(String dirKod) { this.dirKod = dirKod; }
    public String getDirAd() { return dirAd; }
    public void setDirAd(String dirAd) { this.dirAd = dirAd; }
    public String getMdrKod() { return mdrKod; }
    public void setMdrKod(String mdrKod) { this.mdrKod = mdrKod; }
    public String getMdrAd() { return mdrAd; }
    public void setMdrAd(String mdrAd) { this.mdrAd = mdrAd; }
    public String getMdryrdKod() { return mdryrdKod; }
    public void setMdryrdKod(String mdryrdKod) { this.mdryrdKod = mdryrdKod; }
    public String getMdryrdAd() { return mdryrdAd; }
    public void setMdryrdAd(String mdryrdAd) { this.mdryrdAd = mdryrdAd; }
    public String getBassefKod() { return bassefKod; }
    public void setBassefKod(String bassefKod) { this.bassefKod = bassefKod; }
    public String getBassefAd() { return bassefAd; }
    public void setBassefAd(String bassefAd) { this.bassefAd = bassefAd; }
    public String getAmirlikKod() { return amirlikKod; }
    public void setAmirlikKod(String amirlikKod) { this.amirlikKod = amirlikKod; }
    public String getAmirlikAd() { return amirlikAd; }
    public void setAmirlikAd(String amirlikAd) { this.amirlikAd = amirlikAd; }
    public String getPbforKod() { return pbforKod; }
    public void setPbforKod(String pbforKod) { this.pbforKod = pbforKod; }
    public String getPbforAd() { return pbforAd; }
    public void setPbforAd(String pbforAd) { this.pbforAd = pbforAd; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
    public String getCalgrupKod() { return calgrupKod; }
    public void setCalgrupKod(String calgrupKod) { this.calgrupKod = calgrupKod; }
    public String getCalgrupAd() { return calgrupAd; }
    public void setCalgrupAd(String calgrupAd) { this.calgrupAd = calgrupAd; }
}
