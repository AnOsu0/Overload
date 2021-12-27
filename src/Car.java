public class Car {
    int year;
    String brand;
    String model;
    String color;


    Car(int year, String brand, String model, String color){
     this (year, brand, model);
     this.color = color;
    }

    Car(int year, String brand, String model){
        this (year, brand);
        this.model = model;
    }

    Car(int year, String brand){
        this.year = year;
        this.brand = brand;
    }

}