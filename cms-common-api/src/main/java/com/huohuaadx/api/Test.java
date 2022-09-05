package com.huohuaadx.api;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;


/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 02 28,2022
 * @desc: //todo
 */


public class Test {

    public static void main(String[] args) {
        Person person = new Person("张三",18);
        String s = JSON.toJSONString(person);
        System.out.println(s);
        String v = "{\"age\":18,\"name\":\"张三\"}";
        JSONArray arr = JSON.parseArray("[\"菜鸟教程\",\"RUNOOB\"]\n");
        Person parseObject = JSON.parseObject(v,Person.class);
        System.out.println(parseObject);
    }
}
