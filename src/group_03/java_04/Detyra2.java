package group_03.java_04;

import java.util.Scanner;

/*
Te krijohet programi interaktiv qe na mundeson te gjenerojme
nje numer te rastesisht ne rangun x-y.
Pra, perdoruesi do te kete mundesine te vendos x dhe y
Programi jone do te gjeneroj nje numer te rastesishem
    ne mes te x dhe y
Programi do te perfundoj punen ne rastin kur perdoruesi e shtyp
shkronjen Q ose q.
 */
public class Detyra2 {
    public static void main(String[] args){
        Programi.run();
    }
}

class Programi{
    static void run(){
        System.out.println("Programi filloj punen!");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("""
                Per te perfunduar punen shtyp quit(q)
                Per te vazhduar punen shtyp ndonje task tjeter!
                """);
            System.out.print("Input: ");
            String input = scanner.next();
            if(input.charAt(0) == 'q' || input.equals("quit")){
                scanner.close();
                return;
            }
            System.out.print("Vendose rangun (0 100, 100 200): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int randInt = CustomMath.random(x, y);
            System.out.println("Numri i gjeneruar: " + randInt);
        }
    }
}
