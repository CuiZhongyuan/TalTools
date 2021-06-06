package com.taltools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplication {
    @Test
    public void contextLoads() {
        Map map = new HashMap();
        map.put("code","000000");
        map.put("msg","删除成功");
        map.forEach((k,v) ->{
            System.out.println(k.toString()+"===="+map.get(k));
        });
        System.out.println(Math.random());
    }
}
