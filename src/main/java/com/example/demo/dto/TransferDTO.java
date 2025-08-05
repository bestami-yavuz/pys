package com.example.demo.dto;

import java.util.Date;

public class TransferDTO {
    private Integer transferId;
    private Integer persDonemId;
    private String yeniIsKod;
    private String yeniIsAd;
    private String yeniPozisyonKod;
    private String yeniPozisyonAd;
    private String yeniPerOrgKod;
    private String yeniPerOrgAd;
    private String yeniUniteOrgKod;
    private String yeniUniteOrgAd;
    private Byte transferDurum;
    private String transferTalepEdenPerNo;
    private Date transferTalepSaat;
    private String transferOnayPer;
    private Date transferOnaySaat;
    private String transferOnayIptalPer;
    private Date transferOnayIptalSaat;
    private String transferAciklama;

    // Getters and Setters
    public Integer getTransferId() { return transferId; }
    public void setTransferId(Integer transferId) { this.transferId = transferId; }
    public Integer getPersDonemId() { return persDonemId; }
    public void setPersDonemId(Integer persDonemId) { this.persDonemId = persDonemId; }
    public String getYeniIsKod() { return yeniIsKod; }
    public void setYeniIsKod(String yeniIsKod) { this.yeniIsKod = yeniIsKod; }
    public String getYeniIsAd() { return yeniIsAd; }
    public void setYeniIsAd(String yeniIsAd) { this.yeniIsAd = yeniIsAd; }
    public String getYeniPozisyonKod() { return yeniPozisyonKod; }
    public void setYeniPozisyonKod(String yeniPozisyonKod) { this.yeniPozisyonKod = yeniPozisyonKod; }
    public String getYeniPozisyonAd() { return yeniPozisyonAd; }
    public void setYeniPozisyonAd(String yeniPozisyonAd) { this.yeniPozisyonAd = yeniPozisyonAd; }
    public String getYeniPerOrgKod() { return yeniPerOrgKod; }
    public void setYeniPerOrgKod(String yeniPerOrgKod) { this.yeniPerOrgKod = yeniPerOrgKod; }
    public String getYeniPerOrgAd() { return yeniPerOrgAd; }
    public void setYeniPerOrgAd(String yeniPerOrgAd) { this.yeniPerOrgAd = yeniPerOrgAd; }
    public String getYeniUniteOrgKod() { return yeniUniteOrgKod; }
    public void setYeniUniteOrgKod(String yeniUniteOrgKod) { this.yeniUniteOrgKod = yeniUniteOrgKod; }
    public String getYeniUniteOrgAd() { return yeniUniteOrgAd; }
    public void setYeniUniteOrgAd(String yeniUniteOrgAd) { this.yeniUniteOrgAd = yeniUniteOrgAd; }
    public Byte getTransferDurum() { return transferDurum; }
    public void setTransferDurum(Byte transferDurum) { this.transferDurum = transferDurum; }
    public String getTransferTalepEdenPerNo() { return transferTalepEdenPerNo; }
    public void setTransferTalepEdenPerNo(String transferTalepEdenPerNo) { this.transferTalepEdenPerNo = transferTalepEdenPerNo; }
    public Date getTransferTalepSaat() { return transferTalepSaat; }
    public void setTransferTalepSaat(Date transferTalepSaat) { this.transferTalepSaat = transferTalepSaat; }
    public String getTransferOnayPer() { return transferOnayPer; }
    public void setTransferOnayPer(String transferOnayPer) { this.transferOnayPer = transferOnayPer; }
    public Date getTransferOnaySaat() { return transferOnaySaat; }
    public void setTransferOnaySaat(Date transferOnaySaat) { this.transferOnaySaat = transferOnaySaat; }
    public String getTransferOnayIptalPer() { return transferOnayIptalPer; }
    public void setTransferOnayIptalPer(String transferOnayIptalPer) { this.transferOnayIptalPer = transferOnayIptalPer; }
    public Date getTransferOnayIptalSaat() { return transferOnayIptalSaat; }
    public void setTransferOnayIptalSaat(Date transferOnayIptalSaat) { this.transferOnayIptalSaat = transferOnayIptalSaat; }
    public String getTransferAciklama() { return transferAciklama; }
    public void setTransferAciklama(String transferAciklama) { this.transferAciklama = transferAciklama; }
}
