package com.example.demo.dto;

import java.util.Date;

public class GeriBildirimDTO {
    private Integer gbId;
    private Integer gbAlanPersDonemId;
    private Integer gbVerenPersDonemId;
    private Date gbTarihi;
    private String gbYer;
    private String gbAciklama;
    private String oper;
    private Date operSaat;
    private String gbAlanAciklama;
    private Byte gbDurum;
    private String gbGuncellemeDurum;
    private Date gbSmsGonderimTarihi;
    private Byte gbGuncelAciklamaDurum;

    // Getters and Setters
    public Integer getGbId() { return gbId; }
    public void setGbId(Integer gbId) { this.gbId = gbId; }
    public Integer getGbAlanPersDonemId() { return gbAlanPersDonemId; }
    public void setGbAlanPersDonemId(Integer gbAlanPersDonemId) { this.gbAlanPersDonemId = gbAlanPersDonemId; }
    public Integer getGbVerenPersDonemId() { return gbVerenPersDonemId; }
    public void setGbVerenPersDonemId(Integer gbVerenPersDonemId) { this.gbVerenPersDonemId = gbVerenPersDonemId; }
    public Date getGbTarihi() { return gbTarihi; }
    public void setGbTarihi(Date gbTarihi) { this.gbTarihi = gbTarihi; }
    public String getGbYer() { return gbYer; }
    public void setGbYer(String gbYer) { this.gbYer = gbYer; }
    public String getGbAciklama() { return gbAciklama; }
    public void setGbAciklama(String gbAciklama) { this.gbAciklama = gbAciklama; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
    public String getGbAlanAciklama() { return gbAlanAciklama; }
    public void setGbAlanAciklama(String gbAlanAciklama) { this.gbAlanAciklama = gbAlanAciklama; }
    public Byte getGbDurum() { return gbDurum; }
    public void setGbDurum(Byte gbDurum) { this.gbDurum = gbDurum; }
    public String getGbGuncellemeDurum() { return gbGuncellemeDurum; }
    public void setGbGuncellemeDurum(String gbGuncellemeDurum) { this.gbGuncellemeDurum = gbGuncellemeDurum; }
    public Date getGbSmsGonderimTarihi() { return gbSmsGonderimTarihi; }
    public void setGbSmsGonderimTarihi(Date gbSmsGonderimTarihi) { this.gbSmsGonderimTarihi = gbSmsGonderimTarihi; }
    public Byte getGbGuncelAciklamaDurum() { return gbGuncelAciklamaDurum; }
    public void setGbGuncelAciklamaDurum(Byte gbGuncelAciklamaDurum) { this.gbGuncelAciklamaDurum = gbGuncelAciklamaDurum; }
}
