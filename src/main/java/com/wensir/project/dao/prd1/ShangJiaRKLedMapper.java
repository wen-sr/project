package com.wensir.project.dao.prd1;

import com.wensir.project.pojo.prd1.BaoZhuangLed;
import com.wensir.project.pojo.prd1.ShangJiaRKLed;
import com.wensir.project.vo.SumAndCount;

import java.util.List;

public interface ShangJiaRKLedMapper {
    int insert(ShangJiaRKLed record);

    int insertSelective(ShangJiaRKLed record);

    SumAndCount getTotalToday();

    SumAndCount getComplete();

    SumAndCount getIncomplete();

    SumAndCount getTotalTodayCase();

    SumAndCount getCompleteCase();

    SumAndCount getIncompletePK();

    SumAndCount getCompletePK();

    Integer getIncompleteZanCunCK();

    Integer getCompleteZanCunCK();

    SumAndCount getTotalTodayCaseCK();

    SumAndCount getBuHuoData();

    SumAndCount getcompleteBuHuoData();

    SumAndCount getIncompleteBuHuoData();
}