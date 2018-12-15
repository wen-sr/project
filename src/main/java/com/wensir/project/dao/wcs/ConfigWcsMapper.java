package com.wensir.project.dao.wcs;

import com.wensir.project.pojo.wcs.ConfigWcs;
import org.apache.ibatis.annotations.Param;

public interface ConfigWcsMapper {
    int insert(ConfigWcs record);

    int insertSelective(ConfigWcs record);

    ConfigWcs selectConfigWcsByParaName(String key);

    Integer updateConfigWcsByParaName(@Param(value = "key") String key, @Param(value = "value") String value);
}