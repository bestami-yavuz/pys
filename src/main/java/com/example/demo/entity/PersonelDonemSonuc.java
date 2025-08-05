package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_PERSONEL_DONEM_SONUC_TBL")
public class PersonelDonemSonuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SONUC_ID")
    private Integer sonucId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem personelDonem;

    @Column(name = "SONUC_ONAY_ID")
    private Integer sonucOnayId;

    @Column(name = "NIHAI_PUAN")
    private Integer nihaiPuan;

    @Column(name = "ORG_ORT_PUAN")
    private Double orgOrtPuan;

    @Column(name = "ORG_SIRASI")
    private Integer orgSirasi;

    @Column(name = "ORG_PERS_SAYISI")
    private Integer orgPersSayisi;

    @Column(name = "HARF_SKALASI")
    private String harfSkalasi;

    @Column(name = "OPER")
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    @Column(name = "HARFGUNCELLEME")
    private Byte harfGuncelleme = 0;

    // Getters and Setters
    public Integer getSonucId() { return sonucId; }
    public void setSonucId(Integer sonucId) { this.sonucId = sonucId; }
    public PersonelDonem getPersonelDonem() { return personelDonem; }
    public void setPersonelDonem(PersonelDonem personelDonem) { this.personelDonem = personelDonem; }
    public Integer getSonucOnayId() { return sonucOnayId; }
    public void setSonucOnayId(Integer sonucOnayId) { this.sonucOnayId = sonucOnayId; }
    public Integer getNihaiPuan() { return nihaiPuan; }
    public void setNihaiPuan(Integer nihaiPuan) { this.nihaiPuan = nihaiPuan; }
    public Double getOrgOrtPuan() { return orgOrtPuan; }
    public void setOrgOrtPuan(Double orgOrtPuan) { this.orgOrtPuan = orgOrtPuan; }
    public Integer getOrgSirasi() { return orgSirasi; }
    public void setOrgSirasi(Integer orgSirasi) { this.orgSirasi = orgSirasi; }
    public Integer getOrgPersSayisi() { return orgPersSayisi; }
    public void setOrgPersSayisi(Integer orgPersSayisi) { this.orgPersSayisi = orgPersSayisi; }
    public String getHarfSkalasi() { return harfSkalasi; }
    public void setHarfSkalasi(String harfSkalasi) { this.harfSkalasi = harfSkalasi; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
    public Byte getHarfGuncelleme() { return harfGuncelleme; }
    public void setHarfGuncelleme(Byte harfGuncelleme) { this.harfGuncelleme = harfGuncelleme; }
}
