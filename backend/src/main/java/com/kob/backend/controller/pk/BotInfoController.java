package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
//    public List<String> getBotInfo() {
//        List<String> list = new LinkedList<String>();
//        list.add("ni ");
//        list.add("ma ");
//        list.add("si le");
//        return list;
//    }
    public List<Map<String, String>> getBotinfo(){
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "tiger");
        map1.put("version", "1.0.0");
        map1.put("aaa","ccc");
        Map<String, String> m2 = new HashMap<String, String>();
        m2.put("a1", "123");
        m2.put("a4", "213");
        m2.put("a6", "125");
        m2.put("a2", "110");
        list.add(map1);
        list.add(m2);
        return list;

    }
}
