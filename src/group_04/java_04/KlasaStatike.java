package group_04.java_04;

public class KlasaStatike {
    public static void main(String[] args){
        FIEKStudent std1 = new FIEKStudent("John Smith");
        std1.shtypEmrin();
        System.out.println("Fakulteti id: " + std1.fkId);
        System.out.println("Fakulteti id: " + FIEKStudent.fkId);

        FIEKStudent std2 = new FIEKStudent("Dan Brown");
//        std2.fkId = "UP_002";
        FIEKStudent.shtypDetajet();
        System.out.println("Fakulteti id: " + FIEKStudent.fkId);

//        Math
        Math.random();// 0 - 1
//        25 - 108
        // x + Math.random() * (y - x)
        for(int i = 0; i < 10; i++){
            int randInt = (int) (25 + Math.random() * 83);
            System.out.println(randInt);
        }
    }
}

class FIEKStudent{
    static final String fkId = "UP_001";
    String emri;

    FIEKStudent(String emri){
        this.emri = emri;
    }
    void shtypEmrin(){
        System.out.println(this.emri);
        FIEKStudent.shtypDetajet();
    }

    static void shtypDetajet(){
        System.out.println(FIEKStudent.fkId);
    }
}

class Custom{
    static String var1;

    static void method1(){

    }
}
