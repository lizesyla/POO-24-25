package group_02.java_03;

import java.util.Scanner;

public class KlasaScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shtypni numrin: ");
        int userInputNumber = scanner.nextInt();
        System.out.print("Shtypni emri: ");
        String emri = scanner.next();
        System.out.print("Shtypni adresen: ");
        scanner.nextLine();
        String adresa = scanner.nextLine();

        System.out.println("Numri i shtypur: " + userInputNumber);
        System.out.println("Emri: " + emri);
        System.out.println("Adresa: " + adresa);

    }
}
