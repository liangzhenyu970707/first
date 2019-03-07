package ch09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("tom",10);
        map.put("jerry",20);
        System.out.println(map.get("tom"));
        System.out.println(map.get("jerry"));

        Set<String> key =  map.keySet();
        Set<String> keys1 = new HashSet<>(key);
        keys1.add("ssss");

        for(String keys : map.keySet()) {
        System.out.printf("%-5s: %-3d",key,map.get(key));
        }
        System.out.println();
        map.forEach((k,v)->System.out.printf("%-5s: %-3d", k,v));
        }
    }

