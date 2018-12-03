package com.wensir.project.service.ops.impl;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.config.DS;
import com.wensir.project.dao.ops.PickLedMapper;
import com.wensir.project.pojo.ops.PickLed;
import com.wensir.project.service.ops.XiangKuLedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XiangKuLedServiceImpl implements XiangKuLedService {

    @Autowired
    PickLedMapper pickLedMapper;

    @Override
    @DS("ops")
    public ServerResponse getXiangKuLedData() {
        List<PickLed> pickLedList = pickLedMapper.getPickLedData();
        Map<String, Object> map = new HashMap<>();
        map.put("pick", pickLedList);
        return ServerResponse.createBySuccess(map);
    }
}
