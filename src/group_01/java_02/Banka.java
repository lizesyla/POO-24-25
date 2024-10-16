package group_01.java_02;

public class Banka {
    public static void main(String[] args){
        LlogariaBankare llogariaBankare1 = new LlogariaBankare(
          1, "Filan Fisteku", 0.0
        );
        LlogariaBankare llogariaBankare2 = new LlogariaBankare(
                2, "Fistek Filani", 0.0
        );
        llogariaBankare1.depozito(500);
        llogariaBankare2.depozito(200);
        llogariaBankare1.terhiq(250);
        llogariaBankare1.printoTeDhenat();
        llogariaBankare2.printoTeDhenat();
    }
}

class LlogariaBankare{
    int numriLlogarise;
    String emriKlientit;
    double balanca;
    LlogariaBankare(int numriLlogarise, String emriKlientit, double balanca){
        this.numriLlogarise = numriLlogarise;
        this.emriKlientit = emriKlientit;
        this.balanca = balanca;
    }
    void printoTeDhenat(){
        System.out.println("Numri i llogarise: " + this.numriLlogarise);
        System.out.println("Emri i klientit: " + this.emriKlientit);
        System.out.println("Balanca: " + this.balanca);
    }
    void depozito(double shuma){
        this.balanca = this.balanca + shuma;
//        this.balanca += shuma
    }
    void terhiq(double shuma){
        if(shuma > this.balanca){
            System.out.println("Nuk keni fonde te majftueshme!");
            return;
        }
        this.balanca = this.balanca - shuma;
//        this.balanca -= shuma;
    }
}

