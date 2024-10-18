package group_04.java_04;

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
            help();
            System.out.print("Input: ");
            char input = scanner.next().charAt(0);
            if(input == 'q' || input == 'Q'){
                scanner.close();
                return;
            }
            System.out.print("Vendose rangun (ex. 0 100, 100 200): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int randInt = CustomMath.random(x, y);
            System.out.println("Numri i gjeneruar: " + randInt);
        }
    }
    static void help(){
        System.out.println("""
                - Per te perfunduar punen shtyp q (Q)
                - Per te gjeneruar nje numer te rastesishem shtyp nje karakter
                """
        );
    }
}
class CustomMath{
    static int random(int x, int y){
        return (int)(x + Math.random() * ( y - x));
    }
}









