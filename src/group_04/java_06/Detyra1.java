package group_04.java_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args){
//        DetyraFjaletUnike.run();
        DetyraFjalet.run();
    }
}
class DetyraFjaletUnike{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
//        Sot eshte nje dite e mire
//        Sot, eshte, nje, dite, e, mire
        String[] fjalet = input.toLowerCase().split(" ");
        HashSet<String> fjaletUnike = new HashSet<>();
        for(String fjala : fjalet){
            fjaletUnike.add(fjala);
        }
//        fjaletUnike.addAll(Arrays.asList(fjalet));
        System.out.println("Output: " + fjaletUnike);
    }
}


class DetyraFjalet{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String[] fjalet = input.toLowerCase().split(" ");
        HashMap<String, Integer> fjaletUnike = new HashMap<>();
        for(String fjala : fjalet){
//            Integer vlera = fjaletUnike.get(fjala);
            Integer vlera = fjaletUnike.getOrDefault(fjala, 0);
//            if(vlera == null){
//                fjaletUnike.put(fjala, 1);
//                continue;
//            }
            fjaletUnike.put(fjala, vlera + 1);
        }
        System.out.println("Output: " + fjaletUnike);
    }
}
