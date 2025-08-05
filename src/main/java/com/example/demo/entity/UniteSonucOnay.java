package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_unite_sonuc_onay_tbl")
public class UniteSonucOnay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SONUC_ONAY_ID")
    private Integer sonucOnayId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DONEM_NO", referencedColumnName = "DONEM_NO")
    private Donem donem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERS_DONEM_ID", referencedColumnName = "PERS_DONEM_ID")
    private PersonelDonem personelDonem;

    @Column(name = "UNITE_KOD", length = 8)
    private String uniteKod;

    @Column(name = "DURUM")
    private Boolean durum;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter'lar

    public Integer getSonucOnayId() {
        return sonucOnayId;
    }

    public void setSonucOnayId(Integer sonucOnayId) {
        this.sonucOnayId = sonucOnayId;
    }

    public Donem getDonem() {
        return donem;
    }

    public void setDonem(Donem donem) {
        this.donem = donem;
    }

    public PersonelDonem getPersonelDonem() {
        return personelDonem;
    }

    public void setPersonelDonem(PersonelDonem personelDonem) {
        this.personelDonem = personelDonem;
    }

    public String getUniteKod() {
        return uniteKod;
    }

    public void setUniteKod(String uniteKod) {
        this.uniteKod = uniteKod;
    }

    public Boolean getDurum() {
        return durum;
    }

    public void setDurum(Boolean durum) {
        this.durum = durum;
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
}
