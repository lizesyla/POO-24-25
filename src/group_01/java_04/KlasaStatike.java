package group_01.java_04;

public class KlasaStatike {
    public static void main(String[] args){
        System.out.println(FIEKStudent.FK_ID);
        FIEKStudent std1 = new FIEKStudent("John Smith");
        FIEKStudent std2 = new FIEKStudent("Dan Brown");
        System.out.println(std1.FK_ID);
//        std1.FK_ID = "UP_123";
        System.out.println(std2.FK_ID);
        FIEKStudent.shtypTeDhenat();

//        Math
        for(int i = 0; i < 10; i++)
            System.out.println(30 + Math.random() * 70);
    }

}

class FIEKStudent{
    static final String FK_ID = "UP_007";
    String emri;

    FIEKStudent(String emri){
        this.emri = emri;
    }

    static void shtypTeDhenat(){
        System.out.println(FK_ID);
        test();
    }

    static void test(){

    }

}


