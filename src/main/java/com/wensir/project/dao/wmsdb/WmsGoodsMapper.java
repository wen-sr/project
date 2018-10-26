package com.wensir.project.dao.wmsdb;


import com.wensir.project.pojo.wmsdb.WmsGoods;

public interface WmsGoodsMapper {
    int deleteByPrimaryKey(Integer goodId);

    int insert(WmsGoods record);

    int insertSelective(WmsGoods record);

    WmsGoods selectByPrimaryKey(Integer goodId);

    int updateByPrimaryKeySelective(WmsGoods record);

    int updateByPrimaryKey(WmsGoods record);
}