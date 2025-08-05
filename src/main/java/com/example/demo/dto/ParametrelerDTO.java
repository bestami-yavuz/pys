package com.example.demo.dto;

public class ParametrelerDTO {
    private Integer id;
    private String parametreAdi;
    private String parametreDegeri;
    private String parametreTipi;
    private Integer durum;
    private String parametreDegeri4000;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getParametreAdi() { return parametreAdi; }
    public void setParametreAdi(String parametreAdi) { this.parametreAdi = parametreAdi; }

    public String getParametreDegeri() { return parametreDegeri; }
    public void setParametreDegeri(String parametreDegeri) { this.parametreDegeri = parametreDegeri; }

    public String getParametreTipi() { return parametreTipi; }
    public void setParametreTipi(String parametreTipi) { this.parametreTipi = parametreTipi; }

    public Integer getDurum() { return durum; }
    public void setDurum(Integer durum) { this.durum = durum; }

    public String getParametreDegeri4000() { return parametreDegeri4000; }
    public void setParametreDegeri4000(String parametreDegeri4000) { this.parametreDegeri4000 = parametreDegeri4000; }
}