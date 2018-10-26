package com.wensir.project.service.prd1;

import com.wensir.project.ProjectApplication;
import com.wensir.project.pojo.prd1.WenTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(classes = ProjectApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WenTestServiceTest {

    @Autowired
    WenTestService wenTestService;

    @Test
    public void find() throws Exception {
        List<WenTest> list = wenTestService.find();
        log.info("list is {}", list.get(0).getName());
    }

}