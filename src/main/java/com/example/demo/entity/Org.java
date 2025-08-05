package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pys_org_tbl")
public class Org {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORG_ID")
    private Integer orgId;

    @Column(name = "DONEM_NO")
    private Integer donemNo;

    @Column(name = "ORG_KOD", length = 8)
    private String orgKod;

    @Column(name = "ORG_AD", length = 100)
    private String orgAd;

    // Burada seviyeId olarak ManyToOne ilişki ekliyoruz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEVIYE_ID", referencedColumnName = "SEVIYE_ID")
    private OrgSeviyeTanim seviye;

    @Column(name = "UST_ORG_KOD", length = 8)
    private String ustOrgKod;

    @Column(name = "OPER", length = 6)
    private String oper;

    @Column(name = "OPER_SAAT")
    private LocalDateTime operSaat;

    // Getter ve Setter metodları

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getDonemNo() {
        return donemNo;
    }

    public void setDonemNo(Integer donemNo) {
        this.donemNo = donemNo;
    }

    public String getOrgKod() {
        return orgKod;
    }

    public void setOrgKod(String orgKod) {
        this.orgKod = orgKod;
    }

    public String getOrgAd() {
        return orgAd;
    }

    public void setOrgAd(String orgAd) {
        this.orgAd = orgAd;
    }

    public OrgSeviyeTanim getSeviye() {
        return seviye;
    }

    public void setSeviye(OrgSeviyeTanim seviye) {
        this.seviye = seviye;
    }

    public String getUstOrgKod() {
        return ustOrgKod;
    }

    public void setUstOrgKod(String ustOrgKod) {
        this.ustOrgKod = ustOrgKod;
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
