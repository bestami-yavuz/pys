package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_skala_tanim_tbl")
public class SkalaTanim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SKALA_TANIM_NO")
    private Integer skalaTanimNo;

    @Column(name = "TESIS")
    private String tesis;

    @Column(name = "SKALA_ADI", length = 50)
    private String skalaAdi;

    @Column(name = "SKALA_DURUM")
    private String skalaDurum;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getSkalaTanimNo() {
        return skalaTanimNo;
    }

    public void setSkalaTanimNo(Integer skalaTanimNo) {
        this.skalaTanimNo = skalaTanimNo;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    public String getSkalaAdi() {
        return skalaAdi;
    }

    public void setSkalaAdi(String skalaAdi) {
        this.skalaAdi = skalaAdi;
    }

    public String getSkalaDurum() {
        return skalaDurum;
    }

    public void setSkalaDurum(String skalaDurum) {
        this.skalaDurum = skalaDurum;
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
