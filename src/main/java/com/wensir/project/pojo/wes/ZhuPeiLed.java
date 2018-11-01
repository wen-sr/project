package com.wensir.project.pojo.wes;

import java.math.BigDecimal;

public class ZhuPeiLed {
    private String storer;

    private String type;

    private String ailid;

    private BigDecimal sorqty;

    private Integer skucount;

    private String dd;

    public ZhuPeiLed(String storer, String type, String ailid, BigDecimal sorqty, Integer skucount, String dd) {
        this.storer = storer;
        this.type = type;
        this.ailid = ailid;
        this.sorqty = sorqty;
        this.skucount = skucount;
        this.dd = dd;
    }

    public ZhuPeiLed() {
        super();
    }

    public String getStorer() {
        return storer;
    }

    public void setStorer(String storer) {
        this.storer = storer == null ? null : storer.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAilid() {
        return ailid;
    }

    public void setAilid(String ailid) {
        this.ailid = ailid == null ? null : ailid.trim();
    }

    public BigDecimal getSorqty() {
        return sorqty;
    }

    public void setSorqty(BigDecimal sorqty) {
        this.sorqty = sorqty;
    }

    public Integer getSkucount() {
        return skucount;
    }

    public void setSkucount(Integer skucount) {
        this.skucount = skucount;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd == null ? null : dd.trim();
    }
}