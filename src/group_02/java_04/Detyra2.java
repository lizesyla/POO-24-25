package group_02.java_04;


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
               Per te perfunduar punen shtyp: q (Q),
               per te vazhduar punen shtyp nje karakter tjeter.
               """);
           System.out.print("Input: ");
           char inputChar = scanner.next().toLowerCase().charAt(0);
           if(inputChar == 'q'){
               scanner.close();
               return;
           }
           System.out.print("Vendose rangun (50 70, 100 200): ");
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           int randInt = (int)(x + Math.random() * (y - x + 1));
           System.out.println("Numri i gjeneruar: " + randInt);
       }

    }
}

