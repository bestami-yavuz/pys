package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_TRANSFER_TBL")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSFER_ID")
    private Integer transferId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem personelDonem;

    @Column(name = "YENI_IS_KOD")
    private String yeniIsKod;

    @Column(name = "YENI_IS_AD")
    private String yeniIsAd;

    @Column(name = "YENI_POZISYON_KOD")
    private String yeniPozisyonKod;

    @Column(name = "YENI_POZISYON_AD")
    private String yeniPozisyonAd;

    @Column(name = "YENI_PER_ORG_KOD")
    private String yeniPerOrgKod;

    @Column(name = "YENI_PER_ORG_AD")
    private String yeniPerOrgAd;

    @Column(name = "YENI_UNITE_ORG_KOD")
    private String yeniUniteOrgKod;

    @Column(name = "YENI_UNITE_ORG_AD")
    private String yeniUniteOrgAd;

    @Column(name = "TRANSFER_DURUM")
    private Byte transferDurum;

    @Column(name = "TRANSFER_TALEP_EDEN_PER_NO")
    private String transferTalepEdenPerNo;

    @Column(name = "TRANSFER_TALEP_SAAT")
    private Date transferTalepSaat;

    @Column(name = "TRANSFER_ONAY_PER")
    private String transferOnayPer;

    @Column(name = "TRANSFER_ONAY_SAAT")
    private Date transferOnaySaat;

    @Column(name = "TRANSFER_ONAY_IPTAL_PER")
    private String transferOnayIptalPer;

    @Column(name = "TRANSFER_ONAY_IPTAL_SAAT")
    private Date transferOnayIptalSaat;

    @Column(name = "TRANSFER_ACIKLAMA")
    private String transferAciklama;

    // Getters and Setters
    public Integer getTransferId() { return transferId; }
    public void setTransferId(Integer transferId) { this.transferId = transferId; }
    public PersonelDonem getPersonelDonem() { return personelDonem; }
    public void setPersonelDonem(PersonelDonem personelDonem) { this.personelDonem = personelDonem; }
    public String getYeniIsKod() { return yeniIsKod; }
    public void setYeniIsKod(String yeniIsKod) { this.yeniIsKod = yeniIsKod; }
    public String getYeniIsAd() { return yeniIsAd; }
    public void setYeniIsAd(String yeniIsAd) { this.yeniIsAd = yeniIsAd; }
    public String getYeniPozisyonKod() { return yeniPozisyonKod; }
    public void setYeniPozisyonKod(String yeniPozisyonKod) { this.yeniPozisyonKod = yeniPozisyonKod; }
    public String getYeniPozisyonAd() { return yeniPozisyonAd; }
    public void setYeniPozisyonAd(String yeniPozisyonAd) { this.yeniPozisyonAd = yeniPozisyonAd; }
    public String getYeniPerOrgKod() { return yeniPerOrgKod; }
    public void setYeniPerOrgKod(String yeniPerOrgKod) { this.yeniPerOrgKod = yeniPerOrgKod; }
    public String getYeniPerOrgAd() { return yeniPerOrgAd; }
    public void setYeniPerOrgAd(String yeniPerOrgAd) { this.yeniPerOrgAd = yeniPerOrgAd; }
    public String getYeniUniteOrgKod() { return yeniUniteOrgKod; }
    public void setYeniUniteOrgKod(String yeniUniteOrgKod) { this.yeniUniteOrgKod = yeniUniteOrgKod; }
    public String getYeniUniteOrgAd() { return yeniUniteOrgAd; }
    public void setYeniUniteOrgAd(String yeniUniteOrgAd) { this.yeniUniteOrgAd = yeniUniteOrgAd; }
    public Byte getTransferDurum() { return transferDurum; }
    public void setTransferDurum(Byte transferDurum) { this.transferDurum = transferDurum; }
    public String getTransferTalepEdenPerNo() { return transferTalepEdenPerNo; }
    public void setTransferTalepEdenPerNo(String transferTalepEdenPerNo) { this.transferTalepEdenPerNo = transferTalepEdenPerNo; }
    public Date getTransferTalepSaat() { return transferTalepSaat; }
    public void setTransferTalepSaat(Date transferTalepSaat) { this.transferTalepSaat = transferTalepSaat; }
    public String getTransferOnayPer() { return transferOnayPer; }
    public void setTransferOnayPer(String transferOnayPer) { this.transferOnayPer = transferOnayPer; }
    public Date getTransferOnaySaat() { return transferOnaySaat; }
    public void setTransferOnaySaat(Date transferOnaySaat) { this.transferOnaySaat = transferOnaySaat; }
    public String getTransferOnayIptalPer() { return transferOnayIptalPer; }
    public void setTransferOnayIptalPer(String transferOnayIptalPer) { this.transferOnayIptalPer = transferOnayIptalPer; }
    public Date getTransferOnayIptalSaat() { return transferOnayIptalSaat; }
    public void setTransferOnayIptalSaat(Date transferOnayIptalSaat) { this.transferOnayIptalSaat = transferOnayIptalSaat; }
    public String getTransferAciklama() { return transferAciklama; }
    public void setTransferAciklama(String transferAciklama) { this.transferAciklama = transferAciklama; }
}
