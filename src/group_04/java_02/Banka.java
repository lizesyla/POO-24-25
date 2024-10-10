package group_04.java_02;

public class Banka {
    public static void main(String[] t){
        LlogariaBankare l1 = new LlogariaBankare(
                1, "Filan"
        );
        LlogariaBankare l2 = new LlogariaBankare(
                2, "Fisteku"
        );
        l1.printoTeDhenat();
        l2.printoTeDhenat();
        l1.depozito(100);
        l1.terheq(200);
    }
}

class LlogariaBankare{
    int numriLlogarise;
    String emriKlientit;
    double balanca;
    LlogariaBankare(int numriLlogarise, String emriKlientit){
        this.numriLlogarise = numriLlogarise;
        this.emriKlientit = emriKlientit;
        this.balanca = 0.0;
    }
    void printoTeDhenat(){
        System.out.println("Numri i llogarise: " + this.numriLlogarise);
        System.out.println("Emri i klientit: " + this.emriKlientit);
        System.out.println("Balanca: " + this.balanca);
    }
    void depozito(double shuma){
        if(shuma <= 0){
            System.out.println("Transaksioni deshtoj!");
            return;
        }
//        this.balanca = this.balanca + shuma;
        this.balanca += shuma;
    }
    void terheq(double shuma){
        if(shuma < 0 || shuma > this.balanca){
            System.out.println("Transaksioni deshtoj!");
            return;
        }
//        this.balanca = this.balanca - shuma;
        this.balanca -= shuma;
    }

}
