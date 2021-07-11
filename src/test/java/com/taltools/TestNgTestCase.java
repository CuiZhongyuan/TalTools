package com.taltools;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
public class TestNgTestCase {
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
