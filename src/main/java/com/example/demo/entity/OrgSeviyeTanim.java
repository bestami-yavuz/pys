package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_org_seviye_tanim_tbl")
public class OrgSeviyeTanim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEVIYE_ID")
    private Integer seviyeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @Column(name = "SEVIYE_KOD", length = 4)
    private String seviyeKod;

    @Column(name = "SEVIYE_ADI", length = 100)
    private String seviyeAdi;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter metodları

    public Integer getSeviyeId() {
        return seviyeId;
    }

    public void setSeviyeId(Integer seviyeId) {
        this.seviyeId = seviyeId;
    }

    public Donem getDonem() {
        return donem;
    }

    public void setDonem(Donem donem) {
        this.donem = donem;
    }

    public String getSeviyeKod() {
        return seviyeKod;
    }

    public void setSeviyeKod(String seviyeKod) {
        this.seviyeKod = seviyeKod;
    }

    public String getSeviyeAdi() {
        return seviyeAdi;
    }

    public void setSeviyeAdi(String seviyeAdi) {
        this.seviyeAdi = seviyeAdi;
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
