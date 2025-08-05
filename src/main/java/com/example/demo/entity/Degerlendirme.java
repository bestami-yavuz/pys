package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PYS_DEGERLENDIRME_TBL")
public class Degerlendirme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEG_NO")
    private Integer degNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEG_ALAN_PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem degAlanPersDonem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEG_VEREN_PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem degVerenPersDonem;

    @Column(name = "SORU_ID")
    private Integer soruId;

    @Column(name = "SKALA_NO")
    private Integer skalaNo;

    @Column(name = "OPER")
    private String oper;

    @Column(name = "OPER_SAAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date operSaat;

    // Getters and Setters
    public Integer getDegNo() { return degNo; }
    public void setDegNo(Integer degNo) { this.degNo = degNo; }
    public PersonelDonem getDegAlanPersDonem() { return degAlanPersDonem; }
    public void setDegAlanPersDonem(PersonelDonem degAlanPersDonem) { this.degAlanPersDonem = degAlanPersDonem; }
    public PersonelDonem getDegVerenPersDonem() { return degVerenPersDonem; }
    public void setDegVerenPersDonem(PersonelDonem degVerenPersDonem) { this.degVerenPersDonem = degVerenPersDonem; }
    public Integer getSoruId() { return soruId; }
    public void setSoruId(Integer soruId) { this.soruId = soruId; }
    public Integer getSkalaNo() { return skalaNo; }
    public void setSkalaNo(Integer skalaNo) { this.skalaNo = skalaNo; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
}
