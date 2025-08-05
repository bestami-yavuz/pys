package com.example.demo.dto;

import java.util.Date;

public class DegerlendirmeDTO {
    private Integer degNo;
    private Integer degAlanPersDonemId;
    private Integer degVerenPersDonemId;
    private Integer soruId;
    private Integer skalaNo;
    private String oper;
    private Date operSaat;

    // Getters and Setters
    public Integer getDegNo() { return degNo; }
    public void setDegNo(Integer degNo) { this.degNo = degNo; }
    public Integer getDegAlanPersDonemId() { return degAlanPersDonemId; }
    public void setDegAlanPersDonemId(Integer degAlanPersDonemId) { this.degAlanPersDonemId = degAlanPersDonemId; }
    public Integer getDegVerenPersDonemId() { return degVerenPersDonemId; }
    public void setDegVerenPersDonemId(Integer degVerenPersDonemId) { this.degVerenPersDonemId = degVerenPersDonemId; }
    public Integer getSoruId() { return soruId; }
    public void setSoruId(Integer soruId) { this.soruId = soruId; }
    public Integer getSkalaNo() { return skalaNo; }
    public void setSkalaNo(Integer skalaNo) { this.skalaNo = skalaNo; }
    public String getOper() { return oper; }
    public void setOper(String oper) { this.oper = oper; }
    public Date getOperSaat() { return operSaat; }
    public void setOperSaat(Date operSaat) { this.operSaat = operSaat; }
}