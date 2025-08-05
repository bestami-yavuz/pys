package com.example.demo.dto;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
public class HarfSkalaDto {

    private Integer harfSkalaNo;           // Primary key
    private Integer harfSkalaTanimNo;      // Tanım no 
    private String harfSkalaTanimAdi;   // Tanım tablosundan açıklama (Entity’de yok)
    private Integer harfSkalaSiraNo;    // Sıra numarası
    private String harfSkala;           // Harf notu (örneğin: AA, BB)
    private Double deger1;              // Karşılık gelen puan aralığı başlangıcı
    private String kriter1;             // >= veya >
    private Double deger2;              // Karşılık gelen puan aralığı sonu
    private String kriter2;             // <= veya <
    private String oper;                // Mantıksal operatör (AND/OR gibi)
    private LocalDateTime operSaat;     // Tarih-Saat
    private String aciklama;            // Açıklama

    // Getter ve Setter metodları

    public Integer getHarfSkalaNo() {
        return harfSkalaNo;
    }

    public void setHarfSkalaNo(Integer harfSkalaNo) {
        this.harfSkalaNo = harfSkalaNo;
    }

    public Integer getHarfSkalaTanimNo() {
        return harfSkalaTanimNo;
    }

    public void setHarfSkalaTanimNo(Integer harfSkalaTanimNo) {
        this.harfSkalaTanimNo = harfSkalaTanimNo;
    }

    public String getHarfSkalaTanimAdi() {
        return harfSkalaTanimAdi;
    }

    public void setHarfSkalaTanimAdi(String harfSkalaTanimAdi) {
        this.harfSkalaTanimAdi = harfSkalaTanimAdi;
    }

    public Integer getHarfSkalaSiraNo() {
        return harfSkalaSiraNo;
    }

    public void setHarfSkalaSiraNo(Integer harfSkalaSiraNo) {
        this.harfSkalaSiraNo = harfSkalaSiraNo;
    }

    public String getHarfSkala() {
        return harfSkala;
    }

    public void setHarfSkala(String harfSkala) {
        this.harfSkala = harfSkala;
    }

    public Double getDeger1() {
        return deger1;
    }

    public void setDeger1(Double deger1) {
        this.deger1 = deger1;
    }

    public String getKriter1() {
        return kriter1;
    }

    public void setKriter1(String kriter1) {
        this.kriter1 = kriter1;
    }

    public Double getDeger2() {
        return deger2;
    }

    public void setDeger2(Double deger2) {
        this.deger2 = deger2;
    }

    public String getKriter2() {
        return kriter2;
    }

    public void setKriter2(String kriter2) {
        this.kriter2 = kriter2;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
