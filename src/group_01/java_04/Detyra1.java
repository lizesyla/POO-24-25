package group_01.java_04;

// Te krijohet klasa Studenti e cila e ka mundesine
// te tregoj se sa objekte jane krijuar
public class Detyra1 {
    public static void main(String[] args){
        Studenti std1 = new Studenti();
        Studenti std2 = new Studenti();
        Studenti std3 = new Studenti();
        System.out.println(Studenti.OBJECT_NUM);
    }
}

class Studenti{
    static int OBJECT_NUM = 0;

    Studenti(){
        Studenti.OBJECT_NUM++;
    }
}
