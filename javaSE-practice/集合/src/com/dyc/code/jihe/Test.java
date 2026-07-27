package com.dyc.code.jihe;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","张三");
        map.put("002","kk");

        for(String s: map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
