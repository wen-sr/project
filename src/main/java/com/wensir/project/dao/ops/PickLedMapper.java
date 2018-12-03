package com.wensir.project.dao.ops;

import com.wensir.project.pojo.ops.PickLed;

import java.util.List;

public interface PickLedMapper {
    int insert(PickLed record);

    int insertSelective(PickLed record);

    List<PickLed> getPickLedData();
}