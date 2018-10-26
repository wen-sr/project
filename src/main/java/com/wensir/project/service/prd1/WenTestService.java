package com.wensir.project.service.prd1;

import com.wensir.project.config.DS;
import com.wensir.project.dao.prd1.WenTestMapper;
import com.wensir.project.pojo.prd1.WenTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WenTestService {

    @Autowired
    WenTestMapper wenTestMapper;

    @DS("datasource1")
    public List<WenTest> find(){
        List<WenTest> list = wenTestMapper.selectAll();
        log.info(list.get(0).getName());
        return list;
    }
}
