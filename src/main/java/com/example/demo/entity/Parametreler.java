package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pysparametreler")
public class Parametreler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "parametreadi")
    private String parametreadi;

    @Column(name = "parametredegeri")
    private String parametredegeri;

    @Column(name = "parametretipi")
    private String parametretipi;

    @Column(name = "durum")
    private Integer durum;

    @Column(name = "parametredegeri4000", length = 4000)
    private String parametredegeri4000;

    // Getter ve Setter'lar

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParametreadi() {
        return parametreadi;
    }

    public void setParametreadi(String parametreadi) {
        this.parametreadi = parametreadi;
    }

    public String getParametredegeri() {
        return parametredegeri;
    }

    public void setParametredegeri(String parametredegeri) {
        this.parametredegeri = parametredegeri;
    }

    public String getParametretipi() {
        return parametretipi;
    }

    public void setParametretipi(String parametretipi) {
        this.parametretipi = parametretipi;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public String getParametredegeri4000() {
        return parametredegeri4000;
    }

    public void setParametredegeri4000(String parametredegeri4000) {
        this.parametredegeri4000 = parametredegeri4000;
    }
}
