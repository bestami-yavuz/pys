package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_kadro_tbl")
public class Kadro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KADRO_ID")
    private Integer kadroId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @Column(name = "POZ_KOD", length = 9)
    private String pozKod;

    @Column(name = "POZ_AD", length = 100)
    private String pozAd;

    @Column(name = "ORG_KOD", length = 8)
    private String orgKod;

    @Column(name = "UNITE_KOD", length = 8)
    private String uniteKod;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter metodları

    public Integer getKadroId() {
        return kadroId;
    }

    public void setKadroId(Integer kadroId) {
        this.kadroId = kadroId;
    }

    public Donem getDonem() {
        return donem;
    }

    public void setDonem(Donem donem) {
        this.donem = donem;
    }

    public String getPozKod() {
        return pozKod;
    }

    public void setPozKod(String pozKod) {
        this.pozKod = pozKod;
    }

    public String getPozAd() {
        return pozAd;
    }

    public void setPozAd(String pozAd) {
        this.pozAd = pozAd;
    }

    public String getOrgKod() {
        return orgKod;
    }

    public void setOrgKod(String orgKod) {
        this.orgKod = orgKod;
    }

    public String getUniteKod() {
        return uniteKod;
    }

    public void setUniteKod(String uniteKod) {
        this.uniteKod = uniteKod;
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
