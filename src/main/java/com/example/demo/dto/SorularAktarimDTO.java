package com.example.demo.dto;

public class SorularAktarimDTO {
    private Integer siraNo;  // Eklendi
    private String pozisyonKod;
    private Integer soruNo;
    private String soru;
    private String soruAciklama;
    private Double soruPuan;

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
