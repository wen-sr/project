package com.wensir.project.service.wmsdb;

import com.wensir.project.config.DS;
import com.wensir.project.dao.wmsdb.WmsGoodsMapper;
import com.wensir.project.pojo.wmsdb.WmsGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WmsGoodsService {

    @Autowired
    WmsGoodsMapper wmsGoodsMapper;

    @DS("mysql")
    public void find(){
        WmsGoods wmsGoods = wmsGoodsMapper.selectByPrimaryKey(103);
        System.out.println(wmsGoods.getGoodName());
    }

}
