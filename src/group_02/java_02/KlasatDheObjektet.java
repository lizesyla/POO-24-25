package group_02.java_02;

public class KlasatDheObjektet {
    public static void main(String[] args){
        Car car1 = new Car("Red", 100, "audi");
        car1.shtypDetajet();
        car1.changeColor("Black");
        car1.shtypDetajet();

        Car car2 = new Car("Blue", 120, "bmw");
        car2.shtypDetajet();
    }
}

class Car {
    String color;
    int maxSpeed;
    String brand;

    Car(String color, int maxSpeed, String brand){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    void shtypDetajet(){
        System.out.println("Color: " + this.color);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Brand: " + this.brand);
    }

    void changeColor(String color){
        this.color = color;
    }

}
