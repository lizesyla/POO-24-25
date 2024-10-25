package group_01.java_05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ushtrime {
    public static void main(String[] args){
        String emri = "FIEK";
        emri = "UP - " + emri;
//        StringBuilder | StringBuffer
        StringBuilder sb = new StringBuilder(emri);
//        sb
        sb.append(" - Fakulteti ...");

        String reverseString = sb.reverse().toString();
        System.out.println(reverseString);

        StringBuffer stringBuffer = new StringBuffer(emri);
        stringBuffer.reverse().toString();


//        ArrayList, HashSet, HashMap
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(20);
        numrat.add(1, 30);
        numrat.remove(0);
        numrat.add(20);
        numrat.add(20);
        numrat.get(0);
        Integer toRemove = 20;
        numrat.remove(toRemove);
        System.out.println("Lista: " + numrat);
        numrat.forEach(
                (element) -> {
//                    if(element == 30){
//                        numrat.remove(element);
//                    }
                    System.out.println("Elementi: " + element);
                }
        );
//        for(int i = 0; i < numrat.size(); i++){
//            Integer element = numrat.get(i);
//            if(element == 30){
//                numrat.remove(element);
//                continue;
//            }
//            System.out.println("Elementi: " + element);
//        }
        for(int element : numrat){
//            if(element == 30){
//                Integer e = element;
//                numrat.remove(e);
//                continue;
//            }
            System.out.println("Elementi: " + element);
        }
        System.out.println("Lista ne fund: " + numrat);


//        HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println("Set: " + set);
        set.forEach(
                (element) -> {
//                    logic ...
                    System.out.println("Element: " + element);
                }
        );

//        HashMap
        HashMap<Integer, String> listOfString = new HashMap<>();
        listOfString.put(0, "FIEK");
        listOfString.put(1, "UP");

        HashMap<String, int[]> studentet1;
        HashMap<String, ArrayList<Integer>> studentet2;

        listOfString.forEach(
                (key, value) -> {
                    System.out.println("Key: " + key + ", Value: "+ value);
                }
        );
        for(Map.Entry<Integer, String> element : listOfString.entrySet()){
            int key = element.getKey();
            String value = element.getValue();
        }

//        listOfString.keySet();
//        listOfString.values();
        listOfString.get(2);
        listOfString.remove(2);

        // DAYS.MONDAY
        // DAYS.TUESDAY
        String value = "MONDAY";
        if(value.equals(DAYS.MONDAY.toString())){
//            ...
        }
    }
}

enum DAYS {
    MONDAY, TUESDAY
}