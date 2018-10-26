package com.wensir.project.dao.prd1;


import com.wensir.project.pojo.prd1.WenTest;

import java.util.List;

public interface WenTestMapper {
    int insert(WenTest record);

    int insertSelective(WenTest record);

    List<WenTest> selectAll();
}