package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_va_atama_tbl")
public class VaAtama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VA_ATAMA_ID")
    private Integer vaAtamaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @Column(name = "CALISAN_PER_NO", length = 6)
    private String calisanPerNo;

    @Column(name = "VA_PER_NO", length = 6)
    private String vaPerNo;

    @Column(name = "DURUM")
    private Byte durum;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter metodları

    public Integer getVaAtamaId() {
        return vaAtamaId;
    }

    public void setVaAtamaId(Integer vaAtamaId) {
        this.vaAtamaId = vaAtamaId;
    }

    public Donem getDonem() {
        return donem;
    }

    public void setDonem(Donem donem) {
        this.donem = donem;
    }

    public String getCalisanPerNo() {
        return calisanPerNo;
    }

    public void setCalisanPerNo(String calisanPerNo) {
        this.calisanPerNo = calisanPerNo;
    }

    public String getVaPerNo() {
        return vaPerNo;
    }

    public void setVaPerNo(String vaPerNo) {
        this.vaPerNo = vaPerNo;
    }

    public Byte getDurum() {
        return durum;
    }

    public void setDurum(Byte durum) {
        this.durum = durum;
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
