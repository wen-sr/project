package com.wensir.project.pojo.prd1;

import java.math.BigDecimal;

public class BaoZhuangLed {
    private String dd;

    private String packUser;

    private String usrFname;

    private BigDecimal caseqty;

    private BigDecimal qty;

    private BigDecimal skucount;


    public BaoZhuangLed(String dd, String packUser, String usrFname, BigDecimal caseqty, BigDecimal qty, BigDecimal skucount) {
        this.dd = dd;
        this.packUser = packUser;
        this.usrFname = usrFname;
        this.caseqty = caseqty;
        this.qty = qty;
        this.skucount = skucount;
    }

    public BaoZhuangLed() {
        super();
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd == null ? null : dd.trim();
    }

    public String getPackUser() {
        return packUser;
    }

    public void setPackUser(String packUser) {
        this.packUser = packUser == null ? null : packUser.trim();
    }

    public String getUsrFname() {
        return usrFname;
    }

    public void setUsrFname(String usrFname) {
        this.usrFname = usrFname == null ? null : usrFname.trim();
    }

    public BigDecimal getCaseqty() {
        return caseqty;
    }

    public void setCaseqty(BigDecimal caseqty) {
        this.caseqty = caseqty;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getSkucount() {
        return skucount;
    }

    public void setSkucount(BigDecimal skucount) {
        this.skucount = skucount;
    }

}