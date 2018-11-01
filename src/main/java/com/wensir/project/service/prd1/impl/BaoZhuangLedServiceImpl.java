package com.wensir.project.service.prd1.impl;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.dao.prd1.BaoZhuangLedMapper;
import com.wensir.project.pojo.prd1.BaoZhuangLed;
import com.wensir.project.service.prd1.BaoZhuangLedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaoZhuangLedServiceImpl implements BaoZhuangLedService {

    @Autowired
    BaoZhuangLedMapper baoZhuangLedMapper;


    @Override
    public ServerResponse getBaoZhuangLedData() {
        List<BaoZhuangLed> baoZhuangLedList = baoZhuangLedMapper.getBaoZhuangLedData();
        return ServerResponse.createBySuccess(baoZhuangLedList);
    }
}
