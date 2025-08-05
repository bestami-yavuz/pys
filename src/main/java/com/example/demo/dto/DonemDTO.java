package com.example.demo.dto;

import java.util.Date;

public class DonemDTO {
    private Integer donemNo;
    private Integer tesis;
    private String donemAdi;
    private String calTip;
    private Date donemBaslama;
    private Date donemBitis;
    private Date sapTransferTarihi;
    private Integer skalaTanimNo;             // Değiştirildi
    private Integer harfSkalaTanimNo;         // Değiştirildi
    private Integer minCalSure;
    private Integer maxPuanFarki;
    private Byte donemDurum;
    private Integer toplamPuan;
    private String oper;
    private Date operSaat;
    private Date sapTransGerTarihi;
    private Byte beklemeOncDurum;

    // Getters and Setters
    public Integer getDonemNo() { return donemNo; }
    public void setDonemNo(Integer donemNo) { this.donemNo = donemNo; }

    public Integer getTesis() { return tesis; }
    public void setTesis(Integer tesis) { this.tesis = tesis; }

    public String getDonemAdi() { return donemAdi; }
    public void setDonemAdi(String donemAdi) { this.donemAdi = donemAdi; }

    public String getCalTip() { return calTip; }
    public void setCalTip(String calTip) { this.calTip = calTip; }

    public Date getDonemBaslama() { return donemBaslama; }
    public void setDonemBaslama(Date donemBaslama) { this.donemBaslama = donemBaslama; }

    public Date getDonemBitis() { return donemBitis; }
    public void setDonemBitis(Date donemBitis) { this.donemBitis = donemBitis; }

    public Date getSapTransferTarihi() { return sapTransferTarihi; }
    public void setSapTransferTarihi(Date sapTransferTarihi) { this.sapTransferTarihi = sapTransferTarihi; }

    public Integer getSkalaTanimNo() { return skalaTanimNo; }
    public void setSkalaTanimNo(Integer skalaTanimNo) { this.skalaTanimNo = skalaTanimNo; }

    public Integer getHarfSkalaTanimNo() { return harfSkalaTanimNo; }
    public void setHarfSkalaTanimNo(Integer harfSkalaTanimNo) { this.harfSkalaTanimNo = harfSkalaTanimNo; }

    public Integer getMinCalSure() { return minCalSure; }
    public void setMinCalSure(Integer minCalSure) { this.minCalSure = minCalSure; }

    public Integer getMaxPuanFarki() { return maxPuanFarki; }
    public void setMaxPuanFarki(Integer maxPuanFarki) { this.maxPuanFarki = maxPuanFarki; }

    public Byte getDonemDurum() { return donemDurum; }
    public void setDonemDurum(Byte donemDurum) { this.donemDurum = donemDurum; }

    public Integer getToplamPuan() { return toplamPuan; }
    public void setToplamPuan(Integer toplamPuan) { this.toplamPuan = toplamPuan; }

    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }

    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }

    public Date getSapTransGerTarihi() { return sapTransGerTarihi; }
    public void setSapTransGerTarihi(Date sapTransGerTarihi) { this.sapTransGerTarihi = sapTransGerTarihi; }

    public Byte getBeklemeOncDurum() { return beklemeOncDurum; }
    public void setBeklemeOncDurum(Byte beklemeOncDurum) { this.beklemeOncDurum = beklemeOncDurum; }
}
