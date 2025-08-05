package com.example.demo.dto;

import java.util.Date;

public class PersonelDonemSonucDTO {
    private Integer sonucId;
    private Integer persDonemId;
    private Integer sonucOnayId;
    private Integer nihaiPuan;
    private Double orgOrtPuan;
    private Integer orgSirasi;
    private Integer orgPersSayisi;
    private String harfSkalasi;
    private String oper;
    private Date operSaat;
    private Byte harfGuncelleme;

    // Getters and Setters
    public Integer getSonucId() { return sonucId; }
    public void setSonucId(Integer sonucId) { this.sonucId = sonucId; }
    public Integer getPersDonemId() { return persDonemId; }
    public void setPersDonemId(Integer persDonemId) { this.persDonemId = persDonemId; }
    public Integer getSonucOnayId() { return sonucOnayId; }
    public void setSonucOnayId(Integer sonucOnayId) { this.sonucOnayId = sonucOnayId; }
    public Integer getNihaiPuan() { return nihaiPuan; }
    public void setNihaiPuan(Integer nihaiPuan) { this.nihaiPuan = nihaiPuan; }
    public Double getOrgOrtPuan() { return orgOrtPuan; }
    public void setOrgOrtPuan(Double orgOrtPuan) { this.orgOrtPuan = orgOrtPuan; }
    public Integer getOrgSirasi() { return orgSirasi; }
    public void setOrgSirasi(Integer orgSirasi) { this.orgSirasi = orgSirasi; }
    public Integer getOrgPersSayisi() { return orgPersSayisi; }
    public void setOrgPersSayisi(Integer orgPersSayisi) { this.orgPersSayisi = orgPersSayisi; }
    public String getHarfSkalasi() { return harfSkalasi; }
    public void setHarfSkalasi(String harfSkalasi) { this.harfSkalasi = harfSkalasi; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
    public Byte getHarfGuncelleme() { return harfGuncelleme; }
    public void setHarfGuncelleme(Byte harfGuncelleme) { this.harfGuncelleme = harfGuncelleme; }
}
