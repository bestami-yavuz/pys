package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_GB_ONAY_DURUMU_TBL")
public class GbOnayDurumu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KAYIT_ID")
    private Integer kayitId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem personelDonem;

    @Column(name = "GB_ALMA_DURUMU")
    private Integer gbAlmaDurumu = 0;

    @Column(name = "OPER")
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    // Getters and Setters
    public Integer getKayitId() { return kayitId; }
    public void setKayitId(Integer kayitId) { this.kayitId = kayitId; }
    public PersonelDonem getPersonelDonem() { return personelDonem; }
    public void setPersonelDonem(PersonelDonem personelDonem) { this.personelDonem = personelDonem; }
    public Integer getGbAlmaDurumu() { return gbAlmaDurumu; }
    public void setGbAlmaDurumu(Integer gbAlmaDurumu) { this.gbAlmaDurumu = gbAlmaDurumu; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
}
