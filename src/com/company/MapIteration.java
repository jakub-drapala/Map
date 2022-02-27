package com.company;

import java.util.*;

public class MapIteration {

    public static void main(String[] args) {

        // new line

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 17);
        map.put("Python", 3);
        map.put("JS", 7);

        display(map);
    }

    public static void display(Map<String, Integer> map) {
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        for (Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, Integer> entry = iterator.next();
            String delimiter = iterator.hasNext() ? "," : ".";
            System.out.println("Klucz: " + entry.getKey() + ", Value: " + entry.getValue() + delimiter);
        }
    }


//    public static void display(Map<String, Integer> map) {
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
//        for (int i = 0; i < entryList.size(); i++) {
//            Map.Entry<String, Integer> entry = entryList.get(i);
//            String delimiter = i == entryList.size() - 1 ? "." : ",";
//            System.out.println("Klucz: " + entry.getKey() + ", Value: " + entry.getValue() + delimiter);
//        }

//    }
}
