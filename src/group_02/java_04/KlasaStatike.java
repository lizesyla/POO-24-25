package group_02.java_04;

public class KlasaStatike {
    public static void main(String[] args){
        FIEKStudent std1 = new FIEKStudent("Filan");
        FIEKStudent std2 = new FIEKStudent("Filani");
        System.out.println(FIEKStudent.FK_ID);
//        std2.FK_ID = "UP_123";

        System.out.println(std1.emri);
        System.out.println(std1.FK_ID);
        std1.printoEmri();
        System.out.println(FIEKStudent.FK_ID);

//        Math
        Math.random(); // 0 - 1
        for(int i = 0; i < 10; i++){
            // [45 - 100)
            // x + Math.random() * ( y - x)
            int randInt =  (int) (45 + Math.random() * 55);
            System.out.println(randInt);
        }
    }
}

class FIEKStudent{
    static final String FK_ID = "UP_007";
    String emri;
    FIEKStudent(String emri){
        this.emri = emri;
    }
    void printoEmri(){
        System.out.println("Emri: " + this.emri);
        System.out.println(FIEKStudent.FK_ID);
    }
    static void shtypDetajet(){
        System.out.println(FIEKStudent.FK_ID);
    }
}

class StaticClass{
    static int num = 0;

    static void details(){

    }
}