package group_03.java_03;

import java.util.Scanner;
public class KlasaScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendose numrin: ");
        int numri = scanner.nextInt();
        System.out.print("Vendose emrin: ");
        String emri = scanner.next();
        System.out.println("Adresa: ");
        scanner.nextLine();
        String adresa = scanner.nextLine();

        System.out.println("Numri: " + numri);
        System.out.println("Emri: " + emri);
        System.out.println("Adresa: " + adresa);
    }
}
