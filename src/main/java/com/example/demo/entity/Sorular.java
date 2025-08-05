package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_sorular_tbl")
public class Sorular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SORU_ID")
    private Integer soruId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KADRO_ID", referencedColumnName = "KADRO_ID")
    private Kadro kadro;

    @Column(name = "SORU_NO")
    private Integer soruNo;

    @Column(name = "SORU", length = 500)
    private String soru;

    @Column(name = "SORU_ACIKLAMA", length = 700)
    private String soruAciklama;

    @Column(name = "SORU_PUAN", precision = 5, scale = 2)
    private BigDecimal soruPuan;

    @Column(name = "TIP")
    private String tip;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getters and Setters

    public Integer getSoruId() {
        return soruId;
    }

    public void setSoruId(Integer soruId) {
        this.soruId = soruId;
    }

    public Kadro getKadro() {
        return kadro;
    }

    public void setKadro(Kadro kadro) {
        this.kadro = kadro;
    }

    public Integer getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(Integer soruNo) {
        this.soruNo = soruNo;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getSoruAciklama() {
        return soruAciklama;
    }

    public void setSoruAciklama(String soruAciklama) {
        this.soruAciklama = soruAciklama;
    }

    public BigDecimal getSoruPuan() {
        return soruPuan;
    }

    public void setSoruPuan(BigDecimal soruPuan) {
        this.soruPuan = soruPuan;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
