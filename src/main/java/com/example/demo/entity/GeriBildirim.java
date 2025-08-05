package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_GERI_BILDIRIM_TBL")
public class GeriBildirim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GB_ID")
    private Integer gbId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GB_ALAN_PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem gbAlanPersDonem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GB_VEREN_PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem gbVerenPersDonem;

    @Column(name = "GB_TARIHI")
    private Date gbTarihi;

    @Column(name = "GB_YER")
    private String gbYer;

    @Column(name = "GB_ACIKLAMA")
    private String gbAciklama;

    @Column(name = "OPER")
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    @Column(name = "GB_ALAN_ACIKLAMA")
    private String gbAlanAciklama;

    @Column(name = "GB_DURUM")
    private Byte gbDurum = 0;

    @Column(name = "GB_GUNCELLEME_DURUM")
    private String gbGuncellemeDurum;

    @Column(name = "GB_SMS_GONDERIM_TARIHI")
    private Date gbSmsGonderimTarihi;

    @Column(name = "GB_GUNCEL_ACIKLAMA_DURUM")
    private Byte gbGuncelAciklamaDurum = 0;

    // Getters and Setters
    public Integer getGbId() { return gbId; }
    public void setGbId(Integer gbId) { this.gbId = gbId; }
    public PersonelDonem getGbAlanPersDonem() { return gbAlanPersDonem; }
    public void setGbAlanPersDonem(PersonelDonem gbAlanPersDonem) { this.gbAlanPersDonem = gbAlanPersDonem; }
    public PersonelDonem getGbVerenPersDonem() { return gbVerenPersDonem; }
    public void setGbVerenPersDonem(PersonelDonem gbVerenPersDonem) { this.gbVerenPersDonem = gbVerenPersDonem; }
    public Date getGbTarihi() { return gbTarihi; }
    public void setGbTarihi(Date gbTarihi) { this.gbTarihi = gbTarihi; }
    public String getGbYer() { return gbYer; }
    public void setGbYer(String gbYer) { this.gbYer = gbYer; }
    public String getGbAciklama() { return gbAciklama; }
    public void setGbAciklama(String gbAciklama) { this.gbAciklama = gbAciklama; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
    public String getGbAlanAciklama() { return gbAlanAciklama; }
    public void setGbAlanAciklama(String gbAlanAciklama) { this.gbAlanAciklama = gbAlanAciklama; }
    public Byte getGbDurum() { return gbDurum; }
    public void setGbDurum(Byte gbDurum) { this.gbDurum = gbDurum; }
    public String getGbGuncellemeDurum() { return gbGuncellemeDurum; }
    public void setGbGuncellemeDurum(String gbGuncellemeDurum) { this.gbGuncellemeDurum = gbGuncellemeDurum; }
    public Date getGbSmsGonderimTarihi() { return gbSmsGonderimTarihi; }
    public void setGbSmsGonderimTarihi(Date gbSmsGonderimTarihi) { this.gbSmsGonderimTarihi = gbSmsGonderimTarihi; }
    public Byte getGbGuncelAciklamaDurum() { return gbGuncelAciklamaDurum; }
    public void setGbGuncelAciklamaDurum(Byte gbGuncelAciklamaDurum) { this.gbGuncelAciklamaDurum = gbGuncelAciklamaDurum; }
}
