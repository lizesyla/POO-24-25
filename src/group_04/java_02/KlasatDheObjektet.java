package group_04.java_02;

public class KlasatDheObjektet {
   public static void main(String[] arguments){
      Makina m1 = new Makina("Red", 100, "Audi Q5");
      m1.shtypDetajet();
      m1.ndryshoNgjyren("Black");
      m1.shtypDetajet();
   }

}

class Makina{
   String ngjyra;
   int shpejtesia;
   String modeli;
   Makina(String ngjyra, int shpejtesia, String modeli){
      this.ngjyra = ngjyra;
      this.shpejtesia = shpejtesia;
      this.modeli = modeli;
   }
   void shtypDetajet(){
      System.out.println("Ngjyra: " + this.ngjyra);
      System.out.println("Shpejtesia: " + this.shpejtesia);
      System.out.println("Modeli: " + this.modeli);
   }
   void ndryshoNgjyren(String ngjyra){
      this.ngjyra = ngjyra;
   }

}












