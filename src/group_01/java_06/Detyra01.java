package group_01.java_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
Krijoni një program interaktiv që lejon përdoruesin të
shkruajë një fjali dhe më pas shfaq të gjitha fjalët
unike të përdorura në atë fjali.
 */
public class Detyra01 {
    public static void main(String[] args){
//        ProgramiFjaletUnike.run();
        ProgramiNumerimiFjalet.run();
    }
}
class ProgramiFjaletUnike{
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani fjaline: ");
        String fjalia = sc.nextLine();
        String[] fjalet = fjalia.split(" ");
        HashSet<String> fjaletUnike = new HashSet<>();
//        fjaletUnike.addAll(Arrays.asList(fjalet));
        for(String fjala : fjalet){
            fjaletUnike.add(fjala);
        }
        System.out.println("Fjalet unike: " + fjaletUnike);
    }
}


class ProgramiNumerimiFjalet{
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani fjaline: ");
        String fjalia = sc.nextLine();
        String[] fjalet = fjalia.split(" ");
        HashMap<String, Integer> fjaletUnike = new HashMap<>();
        for(String fjala : fjalet){
//            Integer vlera = fjaletUnike.get(fjala);
            Integer vlera = fjaletUnike.getOrDefault(fjala, 0);
            fjaletUnike.put(fjala, vlera + 1);
        }
        System.out.println("Fjalet unike: " + fjaletUnike);
    }
}
