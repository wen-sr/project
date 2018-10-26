package com.wensir.project.pojo.wmsdb;

public class WmsGoods {
    private Integer goodId;

    private String goodName;

    private String goodRype;

    private String goodSize;

    private Double goodValue;

    public WmsGoods(Integer goodId, String goodName, String goodRype, String goodSize, Double goodValue) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodRype = goodRype;
        this.goodSize = goodSize;
        this.goodValue = goodValue;
    }

    public WmsGoods() {
        super();
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodRype() {
        return goodRype;
    }

    public void setGoodRype(String goodRype) {
        this.goodRype = goodRype == null ? null : goodRype.trim();
    }

    public String getGoodSize() {
        return goodSize;
    }

    public void setGoodSize(String goodSize) {
        this.goodSize = goodSize == null ? null : goodSize.trim();
    }

    public Double getGoodValue() {
        return goodValue;
    }

    public void setGoodValue(Double goodValue) {
        this.goodValue = goodValue;
    }
}