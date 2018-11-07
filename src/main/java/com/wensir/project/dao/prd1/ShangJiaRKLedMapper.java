package com.wensir.project.dao.prd1;

import com.wensir.project.pojo.prd1.ShangJiaRKLed;
import com.wensir.project.vo.SumAndCount;

public interface ShangJiaRKLedMapper {
    int insert(ShangJiaRKLed record);

    int insertSelective(ShangJiaRKLed record);

    SumAndCount getTotalToday();

    SumAndCount getComplete();

    SumAndCount getTotalTodayCase();

    SumAndCount getCompleteCase();

    SumAndCount getTotalTodayPK();

    SumAndCount getCompletePK();

    Integer getTotalTodayZanCunCK();

    Integer getCompleteZanCunCK();

    SumAndCount getTotalTodayCaseCK();

    SumAndCount getBuHuoData();
}