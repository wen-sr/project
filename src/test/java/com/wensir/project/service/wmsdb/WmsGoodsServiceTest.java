package com.wensir.project.service.wmsdb;

import com.wensir.project.ProjectApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(classes = ProjectApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WmsGoodsServiceTest {
    @Autowired
    WmsGoodsService wmsGoodsService;

    @Test
    public void find() throws Exception {
        wmsGoodsService.find();
    }

}