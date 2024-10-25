package group_04.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ushtrime {
    public static void main(String[] args){
        String emri = "FIEK";
        emri = "UP - " + emri;
//        StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder(emri);
        sb.append(" - Kompjuterike/Telekom");
        sb.insert(0, "1. ");
        System.out.println("sb: " + sb);
        emri = sb.toString();
        System.out.println("emri: " + emri);

        sb.reverse();
        System.out.println("Reverse: " + sb);
        String subStr = sb.substring(0, 10);
        sb.delete(0, 10);
        System.out.println("Delete: " + sb);

        StringBuffer sbf = new StringBuffer(emri);
        sbf.reverse();
        System.out.println("sbf: " + sbf);

//        ArrayList, HashSet, HashMap
//        Integer, Double, Float, ...
//        int n = 5;
        Integer n2 = 5;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(15);
        numbers.add(100);
        numbers.add(50);
        numbers.add(60);
        numbers.add(0, 100);
        System.out.println("Lista: " + numbers);

        Integer number = 100;
        numbers.remove(number);
        System.out.println("Lista: " + numbers);

//        numbers.removeAll(evenNumbers);
        numbers.size();
        numbers.get(0);
        for(Integer n : numbers){
//            logic ...
//            if(n == 100){
//                numbers.remove(n);
//            }
            System.out.print("Elementi: " + n);
            int index = numbers.indexOf(n);
            System.out.println(", Index: " + index);
        }
        System.out.println("==============");
//        [10, 20 ,30]
        for(int i = 0; i < numbers.size(); i++){
//            i = 0; [20, 30]
//            i = 1; 30;
            Integer n = numbers.get(i);
            if(n == 100){
                numbers.remove(n);
                i--;
                continue;
            }
            System.out.println("Elementi: " + n + ", Index: " + i);
        }
        System.out.println("==============");
        numbers.forEach(
                (n) -> {
//                    if(n == 10){
//                        numbers.remove(n);
//                    }
                   int i = numbers.indexOf(n);
                    System.out.println("Elementi: " + n + ", Index: " + i);
                }
        );

//        HashSet
        HashSet<String> set = new HashSet<>();
        set.add("FIEK");
        set.add("FIM");
        set.add("FNA");
        set.add("FIEK");
        set.add("TEST");
        set.remove("TEST");
//        set.addAll()
//        set.removeAll()
        System.out.println("Set: " + set);

        for(String s : set){
//            logic ...
        }
        set.forEach(
                (s) -> {
                   System.out.println("String: " + s);
                }
        );
        set.removeIf(
                (s) -> {
                    return s.equals("FIEK");
                }
        );
        numbers.removeIf(
                (n) -> n == 10
        );
        System.out.println("SET: " + set);

//        HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Test");
        map.put(200, "Test 2");
        map.put(100, "Test 3");
        System.out.println("Map: " + map);
        map.forEach(
                (key, value) -> {
                    System.out.println("Key: " + key);
                    System.out.println("Value: " + value);
                }
        );
        for(Map.Entry<Integer, String> e : map.entrySet()){
            Integer key = e.getKey();
            String value = e.getValue();
        }
        map.remove(100);
        map.get(100);
        map.getOrDefault(100, "");















    }
}
