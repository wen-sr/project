package com.wensir.project.service.wes.impl;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.config.DS;
import com.wensir.project.dao.wes.ZhuPeiLedMapper;
import com.wensir.project.pojo.wes.ZhuPeiLed;
import com.wensir.project.service.wes.ZhuPeiLedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ZhuPeiLedServiceImpl implements ZhuPeiLedService {

    @Autowired
    ZhuPeiLedMapper zhuPeiLedMapper;

    @Override
    @DS("wes")
    public ServerResponse getZhuPeiLedData() {
        List<ZhuPeiLed> zhuPeiLedList = zhuPeiLedMapper.getZhuPeiLedData();
        return ServerResponse.createBySuccess(zhuPeiLedList);
    }
}
