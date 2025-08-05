package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_harf_skala_tanim_tbl")
public class HarfSkalaTanim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HARF_SKALA_TANIM_NO")
    private Integer harfSkalaTanimNo;

    @Column(name = "TESIS")
    private String tesis;

    @Column(name = "HARF_SKALA_ADI", length = 50)
    private String harfSkalaAdi;

    @Column(name = "SKALA_DURUM")
    private String skalaDurum;  // Eğer sayıysa `Integer` yapabiliriz

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getHarfSkalaTanimNo() {
        return harfSkalaTanimNo;
    }

    public void setHarfSkalaTanimNo(Integer harfSkalaTanimNo) {
        this.harfSkalaTanimNo = harfSkalaTanimNo;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    public String getHarfSkalaAdi() {
        return harfSkalaAdi;
    }

    public void setHarfSkalaAdi(String harfSkalaAdi) {
        this.harfSkalaAdi = harfSkalaAdi;
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
