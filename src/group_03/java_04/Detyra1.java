package group_03.java_04;

// Te krijohet klasa Universiteti e cila na mundeson te
// lexojm numrin e objekteve te krijuara nga kjo klase.
// Te arsyetohet zgjidhja!
public class Detyra1 {
    public static void main(String[] args){
        Universiteti uni1 = new Universiteti();
        Universiteti uni2 = new Universiteti();
        Universiteti uni3 = new Universiteti();

        System.out.println(Universiteti.OBJECT_COUNT);
    }
}

class Universiteti{
//    ...
    static int OBJECT_COUNT = 0;

    Universiteti(){
        Universiteti.OBJECT_COUNT++;
    }
}