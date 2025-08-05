package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_skala_tbl")
public class Skala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SKALA_NO")
    private Integer skalaNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SKALA_TANIM_NO", referencedColumnName = "SKALA_TANIM_NO")
    private SkalaTanim skalaTanim;

    @Column(name = "SKALA_SIRA_NO")
    private Integer skalaSiraNo;

    @Column(name = "SKALA_ACIKLAMA", length = 200)
    private String skalaAciklama;

    @Column(name = "SKALA_AGIRLIK", precision = 10, scale = 2)
    private BigDecimal skalaAgirlik;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getSkalaNo() {
        return skalaNo;
    }

    public void setSkalaNo(Integer skalaNo) {
        this.skalaNo = skalaNo;
    }

    public SkalaTanim getSkalaTanim() {
        return skalaTanim;
    }

    public void setSkalaTanim(SkalaTanim skalaTanim) {
        this.skalaTanim = skalaTanim;
    }

    public Integer getSkalaSiraNo() {
        return skalaSiraNo;
    }

    public void setSkalaSiraNo(Integer skalaSiraNo) {
        this.skalaSiraNo = skalaSiraNo;
    }

    public String getSkalaAciklama() {
        return skalaAciklama;
    }

    public void setSkalaAciklama(String skalaAciklama) {
        this.skalaAciklama = skalaAciklama;
    }

    public BigDecimal getSkalaAgirlik() {
        return skalaAgirlik;
    }

    public void setSkalaAgirlik(BigDecimal skalaAgirlik) {
        this.skalaAgirlik = skalaAgirlik;
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
