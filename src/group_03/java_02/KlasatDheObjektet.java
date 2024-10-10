package group_03.java_02;

public class KlasatDheObjektet {
    public static void main(String[] arguments){
        Car car1 = new Car("red", 100, "bmw"); // ["red", 100, "bmw"]
        car1.shtypDetajet();

        Car car2 = new Car("black", 120, "audi");
        car2.changeColor("white");
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
