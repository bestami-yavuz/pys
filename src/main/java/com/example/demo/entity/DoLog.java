package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PYS_DO_LOG_TBL")
public class DoLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOG_NO")
    private Integer logNo;

    @Column(name = "LOG_DONEM")
    private String logDonem;

    @Column(name = "LOG_YER")
    private String logYer;

    @Column(name = "LOG_MESAJ")
    private String logMesaj;

    @Column(name = "LOG_TARIH")
    private String logTarih;  // Eğer tarih tipinde ise, LocalDateTime ya da Date olarak değiştirilebilir

    // Getters and Setters

    public Integer getLogNo() {
        return logNo;
    }

    public void setLogNo(Integer logNo) {
        this.logNo = logNo;
    }

    public String getLogDonem() {
        return logDonem;
    }

    public void setLogDonem(String logDonem) {
        this.logDonem = logDonem;
    }

    public String getLogYer() {
        return logYer;
    }

    public void setLogYer(String logYer) {
        this.logYer = logYer;
    }

    public String getLogMesaj() {
        return logMesaj;
    }

    public void setLogMesaj(String logMesaj) {
        this.logMesaj = logMesaj;
    }

    public String getLogTarih() {
        return logTarih;
    }

    public void setLogTarih(String logTarih) {
        this.logTarih = logTarih;
    }
}
