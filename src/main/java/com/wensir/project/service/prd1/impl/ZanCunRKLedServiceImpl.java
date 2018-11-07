package com.wensir.project.service.prd1.impl;

import com.wensir.project.common.ServerResponse;
import com.wensir.project.dao.prd1.ShangJiaRKLedMapper;
import com.wensir.project.dao.prd1.ZanCunRkLedMapper;
import com.wensir.project.service.prd1.ShangJiaRKLedService;
import com.wensir.project.service.prd1.ZanCunRKLedService;
import com.wensir.project.vo.SumAndCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ZanCunRKLedServiceImpl implements ZanCunRKLedService {

    @Autowired
    ShangJiaRKLedService shangJiaRKLedService;

    @Autowired
    ShangJiaRKLedMapper shangJiaRKLedMapper;

    @Autowired
    ZanCunRkLedMapper zanCunRkLedMapper;

    @Override
    public ServerResponse getTuoPan4LedData() {
        Integer totalToday_ZanCunRK = zanCunRkLedMapper.getTotalToday();
        Integer complete_ZanCunRK = zanCunRkLedMapper.getComplete();
        SumAndCount totalToday_ShangJiaRK = shangJiaRKLedMapper.getTotalToday();
        if(totalToday_ShangJiaRK == null){
            totalToday_ShangJiaRK = new SumAndCount();
        }
        SumAndCount complete_ShangJiaRK = shangJiaRKLedMapper.getComplete();
        if(complete_ShangJiaRK == null){
            complete_ShangJiaRK = new SumAndCount();
        }
        SumAndCount totalToday_case = shangJiaRKLedMapper.getTotalTodayCase();
        if(totalToday_case == null){
            totalToday_case = new SumAndCount();
        }
        SumAndCount complete_case = shangJiaRKLedMapper.getCompleteCase();
        if(complete_case == null){
            complete_case = new SumAndCount();
        }
        SumAndCount totalToday_PK = shangJiaRKLedMapper.getTotalTodayPK();
        if(totalToday_PK == null){
            totalToday_PK = new SumAndCount();
        }
        SumAndCount complete_PK = shangJiaRKLedMapper.getCompletePK();
        if(complete_PK == null){
            complete_PK = new SumAndCount();
        }
        Integer totalToday_ZanCunCK = shangJiaRKLedMapper.getTotalTodayZanCunCK();
        Integer complete_ZanCunCK = shangJiaRKLedMapper.getCompleteZanCunCK();
        SumAndCount buHuo = shangJiaRKLedMapper.getBuHuoData();
        if(buHuo == null){
            buHuo = new SumAndCount();
        }

        Map<String, Object> map = new HashMap<>();
        map.put("totalToday_ZanCunRK", totalToday_ZanCunRK);
        map.put("complete_ZanCunRK", complete_ZanCunRK);
        map.put("totalToday_ShangJiaRK", totalToday_ShangJiaRK);
        map.put("complete_ShangJiaRK", complete_ShangJiaRK);
        map.put("totalToday_case", totalToday_case);
        map.put("complete_case", complete_case);
        map.put("totalToday_PK", totalToday_PK);
        map.put("complete_PK", complete_PK);
        map.put("totalToday_ZanCunCK", totalToday_ZanCunCK);
        map.put("complete_ZanCunCK", complete_ZanCunCK);
        map.put("buHuo", buHuo);


        return ServerResponse.createBySuccess(map);
    }
}
