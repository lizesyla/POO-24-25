package group_03.java_06;

import java.util.*;

public class Detyra1 {
    public static void main(String[] args){
        ProgramiFjalet.run();
    }
}

class ProgramiFjaletUnike{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        // Sot eshte nje dite e bukur
        // [Sot, eshte, nje, dite, e, bukur]
        String[] fjalet = input.split(" ");
        HashSet<String> fjaletUnike = new HashSet<>();
//        Mundesia 1:
//        List<String> fjaletList = Arrays.asList(fjalet);
//        fjaletUnike.addAll(fjaletList);
//        Mundesia 2:
        for(String s : fjalet){
            fjaletUnike.add(s);
        }
        System.out.println("Output: " + fjaletUnike);
        sc.close();
    }
}

class ProgramiFjalet{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        // Sot eshte nje dite e bukur
        // [Sot, eshte, nje, dite, e, bukur]
        String[] fjalet = input.toLowerCase().split(" ");
        HashMap<String, Integer> fjaletUnike = new HashMap<>();
        for(String s : fjalet){
//            Integer vlera = fjaletUnike.get(s);
            Integer vlera = fjaletUnike.getOrDefault(s, 0);
            fjaletUnike.put(s, vlera + 1);
        }
        System.out.println("Output: " + fjaletUnike);
        sc.close();
    }
}