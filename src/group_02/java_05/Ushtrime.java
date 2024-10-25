package group_02.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ushtrime {
    public static void main(String[] args){
        String emri = "FIEK";
        emri = "UP - " + emri;

//         StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder(emri);
        sb.append(" - Fakulteti i Inxhinierise ...");
        System.out.println("StringBuilder: " + sb);
        String newEmri = sb.toString();
        String reverseEmri = sb.reverse().toString();
        System.out.println("Reverse: " + reverseEmri);
        sb.insert(0, "This is a test");
        System.out.println("new sb: " + sb);

        StringBuffer sbf = new StringBuffer(emri);
        sbf.append("Test");
        sbf.reverse();

//        ArrayList, HashSet, HashMap
//        int - Integer
        Integer numri = 5;
        int numti2 = 5;
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(5);
        numrat.add(6);
        numrat.add(5);
        numrat.add(7);
        numrat.add(0, 10);
        numrat.add(1, 20);

        numrat.remove(5);
        numrat.remove(numri);
        System.out.println("Lista: " + numrat);

        numrat.forEach(
                (n) -> {
                    System.out.println("Elementi: " + n + ", Index: " + numrat.indexOf(n));
//                    numrat.indexOf(n);
//                    if(n == 5){
//                        numrat.remove(n);
//                    }
                }
        );
        for(int i = 0 ; i < numrat.size() ; i++){
//            i = 1
//            [10, 20, 6 ,5];

            Integer n = numrat.get(i);
            if(n == 20){
                numrat.remove(i);
//                i = 1
//                [10, 6, 5]
                System.out.println("Numri: " + numrat.get(i));
                continue;
            }
            System.out.println("Numri: " + n);
        }
//        for(Integer n : numrat){
//            if(n == 10){
//                numrat.remove(n);
//            }
//        }

//        HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Set: " + set);
        set.forEach(
                (n) ->{
                    System.out.println("Elementi: " + n);
                }
        );
        set.remove(1);
        set.size();

//        HashMap
//        HashMap<Student, ArrayList<Provime> >
        HashMap<String, Integer> map = new HashMap<>();
        map.put("String", 10);



    }
}
