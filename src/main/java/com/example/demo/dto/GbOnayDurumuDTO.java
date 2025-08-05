package com.example.demo.dto;

import java.util.Date;

public class GbOnayDurumuDTO {
    private Integer kayitId;
    private Integer persDonemId;
    private Integer gbAlmaDurumu;
    private String oper;
    private Date operSaat;

    // Getters and Setters
    public Integer getKayitId() { return kayitId; }
    public void setKayitId(Integer kayitId) { this.kayitId = kayitId; }
    public Integer getPersDonemId() { return persDonemId; }
    public void setPersDonemId(Integer persDonemId) { this.persDonemId = persDonemId; }
    public Integer getGbAlmaDurumu() { return gbAlmaDurumu; }
    public void setGbAlmaDurumu(Integer gbAlmaDurumu) { this.gbAlmaDurumu = gbAlmaDurumu; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
}
