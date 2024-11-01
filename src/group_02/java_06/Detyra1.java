package group_02.java_06;

import java.util.*;

public class Detyra1 {
    public static void main(String[] args){
//        ProgramiFjalet.run();
        ProgramiNumeroFjalet.run();
    }
}
class ProgramiFjalet{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String[] fjalet = input.split(" ");
        HashSet<String> fjaletUnike = new HashSet<>();
//        List<String> listaFjalet = Arrays.asList(fjalet);
//        fjaletUnike.addAll(Arrays.asList(fjalet));
        for(String s : fjalet){
            fjaletUnike.add(s);
        }
        System.out.println("Output: " + fjaletUnike);
    }
}


class ProgramiNumeroFjalet{
    static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String[] fjalet = input.split(" ");
        HashMap<String, Integer> fjaletUnike = new HashMap<>();
//        List<String> listaFjalet = Arrays.asList(fjalet);
//        fjaletUnike.addAll(Arrays.asList(fjalet));
        for(String s : fjalet){
            int vlera = fjaletUnike.getOrDefault(s, 0);
            fjaletUnike.put(s, vlera + 1);
        }
        System.out.println("Output: " + fjaletUnike);
    }
}
