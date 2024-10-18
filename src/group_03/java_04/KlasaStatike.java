package group_03.java_04;

import java.util.Random;

public class KlasaStatike {
    public static void main(String[] args){
        FIEKStudent std1 = new FIEKStudent("John Smith");
        std1.shtypEmrin();
        System.out.println("Fakulteti Id: " + FIEKStudent.FK_ID); // std1.FK_ID

        FIEKStudent std2 = new FIEKStudent("Dan Brown");
//        std2.FK_ID = "UP_002";

        std2.shtypDetajet();
        FIEKStudent.shtypDetajet();
        System.out.println("Fakulteti Id: " + std2.FK_ID);

//        Math
        Math.random(); // 0 - 1
        // x - y
        // x + Math.random() * (y - x)
        // 30 + Math.random() * 75
        for(int i = 0; i < 20; i++){
            int randInt = (int) (30 + Math.random() * 75);
            System.out.println(randInt);
        }
    }
}

class CustomMath{
    static int random(int x, int y){
        return (int)(x + Math.random() * (y - x));
    }
}

class FIEKStudent{
    static final String FK_ID = "UP_001";
    String emri;

    FIEKStudent(String emri){
        this.emri = emri;
    }

    void shtypEmrin(){
        System.out.println("Emri: " + this.emri);
        FIEKStudent.shtypDetajet();
    }

    static void shtypDetajet(){
        System.out.println("FK_ID: " + FIEKStudent.FK_ID);
    }
}

class Studenti{
    static String var1;
//    ...

    static void method1(){
//        ..
    }
}
