package group_02.java_04;

// Te krijohet klasa Studenti e cila na mundeson
// te shfaqim ne ekran sa objekte te klases jane krijuar
// Te arsyetohet pergjigja!
public class Detyra1 {
    public static void main(String[] args){
        Studenti std1 = new Studenti();
        Studenti std2 = new Studenti();
        System.out.println(Studenti.OBJECT_COUNT);
    }
}
class Studenti{
    static int OBJECT_COUNT = 0;
    Studenti(){
        OBJECT_COUNT++;
    }
}
