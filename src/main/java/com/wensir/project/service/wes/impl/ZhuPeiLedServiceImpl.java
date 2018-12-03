package com.wensir.project.service.wes.impl;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.config.DS;
import com.wensir.project.dao.wes.ZhuPeiLedMapper;
import com.wensir.project.pojo.wes.ZhuPeiLed;
import com.wensir.project.pojo.wes.ZhuPeiZongBiao;
import com.wensir.project.service.wes.ZhuPeiLedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ZhuPeiLedServiceImpl implements ZhuPeiLedService {

    @Autowired
    ZhuPeiLedMapper zhuPeiLedMapper;

    @Override
    @DS("wes")
    public ServerResponse getZhuPeiLedData() {
        List<ZhuPeiLed> zhuPeiLedList = zhuPeiLedMapper.getZhuPeiLedData();

        List<ZhuPeiZongBiao> zhuPeiZongBiaoList = zhuPeiLedMapper.getZhuPeiZongBiaoData();

        Map<String, Object> map = new HashMap<>();
        map.put("zhuPeiLedList", zhuPeiLedList);
        map.put("zhuPeiZongBiaoList", zhuPeiZongBiaoList);

        return ServerResponse.createBySuccess(map);
    }
}
