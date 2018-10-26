package com.wensir.project.pojo.prd1;

import java.math.BigDecimal;

public class WenTest {
    private BigDecimal id;

    private String name;

    public WenTest(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }

    public WenTest() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}