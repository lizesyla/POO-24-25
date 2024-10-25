package group_03.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ushtrime {
    public static void main(String[] args){
        String emri = "FIEK";
        emri += " - UP";
//        StringBuilder dhe StringBuffer
        StringBuilder sb = new StringBuilder(emri);
        sb.append(" - Prishtine");
        sb.insert(0, "1. ");
        String newEmri = sb.toString();
        System.out.println("Vlera e emrit: " + sb);
        sb.reverse();
        String subString = sb.substring(0, 10);
        System.out.println("Vlera e emrit: " + sb);

        StringBuffer sbf = new StringBuffer(emri);
        sbf.append(" This is a test");
        sbf.reverse();
        System.out.println(sbf);
//        ArrayList, HashSet, HashMap
//        Integer n = 5;
        ArrayList<Integer> listaNumrave = new ArrayList<>();
        listaNumrave.add(10);
        listaNumrave.add(10);
        listaNumrave.add(30);
        listaNumrave.add(40);
        listaNumrave.add(10);
        listaNumrave.add(50);
        listaNumrave.add(10);
        listaNumrave.add(25);
        listaNumrave.add(1, 20);
//        listaNumrave.add(listaQifte);

        Integer vleraPerLargin = 10;
        listaNumrave.remove(vleraPerLargin);

        System.out.println("Lista: " + listaNumrave);
        ArrayList<Integer> nums = new ArrayList<>();
        listaNumrave.removeAll(nums);

        listaNumrave.get(1);
        listaNumrave.getFirst();
        listaNumrave.size();

        listaNumrave.forEach(
                (n) -> {
//                    if(n == 10){
//                        listaNumrave.remove(n);
//                    }
                    System.out.print("Elementi: " + n);
                    int index = listaNumrave.indexOf(n);
                    System.out.println(", Index: " + index);

                }
        );
        for(Integer n : listaNumrave){
//            if(n == 10){
//                listaNumrave.remove(n);
//            }
            System.out.print("Elementi: " + n);
            int index = listaNumrave.indexOf(n);
            System.out.println(", Index: " + index);
        }
        System.out.println("Gjendja aktuale: " + listaNumrave);
//        [20, 30]
        for(int i = 0; i < listaNumrave.size(); i++){
//            i = 0; n = 10
            Integer n = listaNumrave.get(i);
            if(n == 10){
                listaNumrave.remove(n);
                i--;
                continue;
            }
            System.out.println("Elementi: " + n + ", Index: " + i);
        }
//        System.out.println("Lista: " + listaNumrave);

//        HashSet
        HashSet<String> set = new HashSet<>();
        set.add("FIEK");
        set.add("FIM");
        set.add("FNA");
        set.add("FIEK");
        set.add(new String("FIEK"));
        System.out.println("Set: " + set);
        set.size();
//        set.remove()
        set.forEach(
                (s) -> {
                    System.out.println("Elementi: " + s);
                }
        );
        for(String s : set){
            System.out.println("Elementi: " + s);
        }

//        HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("This is a test", 10);
        map.put("FIEK", 230);
        map.put("TEST", 12);
        map.put("Another test", 250);

        map.remove("This is a test");

        System.out.println("Map: " + map);
        System.out.println(map.get("FIEK"));
        map.put("FIEK", 250);
        System.out.println("Map: " + map);
        // Integer
        // ArrayList<Integer>
        HashMap<String, HashMap<Integer, Integer> > notat;

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }


        map.forEach(
                (key, value)->{
                    System.out.println("Key: " + key + ", Value: "+ value);
                }
        );















    }
}
