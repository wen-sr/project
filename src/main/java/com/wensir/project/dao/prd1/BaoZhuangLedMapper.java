package com.wensir.project.dao.prd1;

import com.wensir.project.pojo.prd1.BaoZhuangLed;

import java.util.List;

public interface BaoZhuangLedMapper {
    int insert(BaoZhuangLed record);

    int insertSelective(BaoZhuangLed record);

    List<BaoZhuangLed> getBaoZhuangLedData();
}