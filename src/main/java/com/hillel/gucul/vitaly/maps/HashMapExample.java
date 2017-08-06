package com.hillel.gucul.vitaly.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by insomnia on 06.08.17.
 */
public class HashMapExample {

    public static void main(String[] args) {

        //k -это Key (ключ), V - Value (значение)
        Map<Integer, String> map = new HashMap();
        map.put(1, "I live in Kiev");
        map.put(2, "I live in Lviv");
        map.put(3, "I live in Madrid");
        map.put(4, "I live in London");
        map.put(5, "I live in New York");

        //values in array type
        System.out.println(map.values());

        //All Map with keys
        System.out.println(map.entrySet());

        System.out.println(map);

        System.out.println(map.isEmpty());

        for (int i = 0; i <= map.size() ; i++) {
            System.out.println(map.get(i));
        }
        System.out.println(map.keySet());

        map.replace(3,"Hello");

        System.out.println(map.entrySet());

        map.remove(3);

        System.out.println(map.entrySet());

        for (HashMap.Entry objectMap: map.entrySet()) {
            System.out.println(objectMap.getValue() + " = " + objectMap.getKey());
            objectMap.setValue("Good Bye");
            System.out.println(objectMap.getValue() + " = " + objectMap.getKey());
        }

        Map<Integer, String> hashMap = new HashMap();

        hashMap.put(1,"January");
        hashMap.put(2,"February");
        hashMap.put(3,"March");
        hashMap.put(4,"April");
        hashMap.put(5,"May");
        hashMap.put(6,"");
        hashMap.put(7,"");
        hashMap.put(9,"");
        hashMap.put(10,"");
        hashMap.put(11,"");
        hashMap.put(12,"");

        Integer y = null;

        for (HashMap.Entry<Integer, String> mapMonth : hashMap.entrySet()) {
            y = mapMonth.getKey();
            //y = Integer.parseInt(mapMonth.getKey().toString())
            if (mapMonth.getValue().equals("")) {
                switch (y) {
                    case 6:
                        mapMonth.setValue("June");
                        break;
                    case 7:
                        mapMonth.setValue("July");
                        break;
                    case 8:
                        mapMonth.setValue("August");
                        break;
                    case 9:
                        mapMonth.setValue("September");
                        break;
                    case 10:
                        mapMonth.setValue("October");
                        break;
                    case 11:
                        mapMonth.setValue("November");
                        break;
                    case 12:
                        mapMonth.setValue("December");
                        break;
                }
            }
        }

        System.out.println(hashMap.entrySet());

        Random random = new Random();
        Map<Integer, Integer> newMap = new HashMap<>();

        for (int i = 0; i < 100 ; i++) {
            //Create number from 0 to 10
            int number = random.nextInt(10);
            Integer frequency = newMap.get(number);
            newMap.put(number, frequency == null ? 1: frequency + 1);

        }
        System.out.println(newMap);
    }
}
