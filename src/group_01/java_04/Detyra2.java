package group_01.java_04;

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

    static int generate(int x, int y){
        return (int) (x + Math.random() * (y - x));
    }
    static void run(){
        System.out.println("Programi filloj punen!");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("""
                Per te vazhduar gjenerimin e numrit shtyp v (V)
                Per te perfunduar punen shtyp q (Q)
                """);
            System.out.print("Input: ");
            char input = sc.next().charAt(0);
            if(input == 'q' || input == 'Q'){
                sc.close();
                return;
            }
            System.out.print("Vendose rangun e gjenerimit: ");
            int x = sc.nextInt(); // 0 30
            int y = sc.nextInt(); // 50 100
            int randInt = generate(x, y);
            System.out.println("Numri i gjeneruar: " + randInt);
        }
    }
}
