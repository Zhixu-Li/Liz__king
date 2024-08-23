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
    public Map<String, String> getBotinfo(){

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "tiger");
        map1.put("version", "1.0.0");


        return map1;

    }
}
