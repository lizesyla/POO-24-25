package group_03.java_02;

public class Banka{
    public static void main(String[] args){
        LlogariaBankare llogariaBankare = new LlogariaBankare(
                1, "Filan Fisteku"
        );
        llogariaBankare.depozito(500);
        llogariaBankare.terheq(300);
        llogariaBankare.shtypTeDhenat();
        llogariaBankare.terheq(500);
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
    void shtypTeDhenat(){
        System.out.println("Numri i llogarise: " + this.numriLlogarise);
        System.out.println("Emri i klientit: " + this.emriKlientit);
        System.out.println("Balanca: " + this.balanca);
    }
    void depozito(double shuma){
        if(shuma <= 0){
            System.out.println("Nuk lejohet depozita!");
            return;
        }
        this.balanca = this.balanca + shuma;
//        this.balanca += shuma;
    }
    void terheq(double shuma){
        if(shuma < 0 || shuma > this.balanca){
            System.out.println("Nuk lejohet terheqja!");
            return;
        }
        this.balanca -= shuma;
    }
}
















