package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 50);
        map.put("b", 400);
        map.put("c", 300);
        map.put("d", 500);
        map.put("e", 3500);
        map.put("f", 4500);
        map.put("g", 5500);
        map.put("h", 450);
        map.put("i", 300);
        map.put("j", 10500);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<String, Integer>(map);

        /*Iterator<HashMap.Entry<String, Integer>> iterator = copyMap.entrySet().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getValue() < 500) map.remove(iterator.next().getKey());
        }*/

        for(HashMap.Entry<String, Integer> pair : copyMap.entrySet()){
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}