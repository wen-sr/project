package com.wensir.project.dao.wes;

import com.wensir.project.pojo.wes.ZhuPeiLed;
import com.wensir.project.pojo.wes.ZhuPeiZongBiao;

import java.util.List;

public interface ZhuPeiLedMapper {
    int insert(ZhuPeiLed record);

    int insertSelective(ZhuPeiLed record);

    List<ZhuPeiLed> getZhuPeiLedData();

    List<ZhuPeiZongBiao> getZhuPeiZongBiaoData();
}