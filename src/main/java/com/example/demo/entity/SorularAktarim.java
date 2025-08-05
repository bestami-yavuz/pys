package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pys_sorular_aktarim_tbl")
public class SorularAktarim {

    @Id
    @Column(name = "sira_no")
    private Integer siraNo;

    @Column(name = "pozisyon_kod")
    private String pozisyonKod;

    @Column(name = "soru_no")
    private Integer soruNo;

    @Column(name = "soru")
    private String soru;

    @Column(name = "soru_aciklama")
    private String soruAciklama;

    @Column(name = "soru_puan")
    private Double soruPuan;

    // Getters and Setters
    public Integer getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(Integer siraNo) {
        this.siraNo = siraNo;
    }

    public String getPozisyonKod() {
        return pozisyonKod;
    }

    public void setPozisyonKod(String pozisyonKod) {
        this.pozisyonKod = pozisyonKod;
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

    public Double getSoruPuan() {
        return soruPuan;
    }

    public void setSoruPuan(Double soruPuan) {
        this.soruPuan = soruPuan;
    }
}
