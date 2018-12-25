package com.wensir.project.service.wcs.impl;

import com.wensir.project.common.Constant;
import com.wensir.project.common.ServerResponse;
import com.wensir.project.config.DS;
import com.wensir.project.dao.wcs.ConfigWcsMapper;
import com.wensir.project.pojo.wcs.ConfigWcs;
import com.wensir.project.service.wcs.IConfigWcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigWcsServiceImpl implements IConfigWcsService {

    @Autowired
    ConfigWcsMapper configWcsMapper;

    @DS("wcs")
    @Override
    public ServerResponse selectConfigWcs(String key){
        if(key == null) {
            key = Constant.ConfigWCS.TRANS_MODE_3T4;
        }

        ConfigWcs configWcs = configWcsMapper.selectConfigWcsByParaName(key);
        if(configWcs != null){
            return ServerResponse.createBySuccess(configWcs);
        }
        return ServerResponse.createBySuccessMsg("数据查询失败，请联系管理员");
    }

    @DS("wcs")
    @Override
    public ServerResponse updateConfigWcs(String key, String value){
        if(key == null) {
            key = Constant.ConfigWCS.TRANS_MODE_3T4;
        }

        int i = configWcsMapper.updateConfigWcsByParaName(key, value);
        if(i > 0){
            return ServerResponse.createBySuccessMsg("修改成功");
        }
        return ServerResponse.createBySuccessMsg("修改失败，请联系管理员");
    }

}
