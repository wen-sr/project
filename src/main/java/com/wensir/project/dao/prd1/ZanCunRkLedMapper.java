package com.wensir.project.dao.prd1;

import com.wensir.project.pojo.prd1.ZanCunRkLed;

public interface ZanCunRkLedMapper {
    Integer insert(ZanCunRkLed record);

    Integer insertSelective(ZanCunRkLed record);

    Integer getTotalToday();

    Integer getComplete();

    Integer getIncomplete();
}