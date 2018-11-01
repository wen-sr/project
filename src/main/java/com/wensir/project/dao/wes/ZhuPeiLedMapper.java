package com.wensir.project.dao.wes;

import com.wensir.project.pojo.wes.ZhuPeiLed;

import java.util.List;

public interface ZhuPeiLedMapper {
    int insert(ZhuPeiLed record);

    int insertSelective(ZhuPeiLed record);

    List<ZhuPeiLed> getZhuPeiLedData();
}