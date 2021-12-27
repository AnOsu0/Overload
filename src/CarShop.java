public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car (2017, "Audi", "A6", "czarny");
        Car car2 = new Car(2017,"Audi","A7");
        Car car3 = new Car (2016,"mercedes");
        System.out.println(car1.model + " " + car1.color);
        System.out.println(car2.model + " " + car2.color);
        System.out.println(car3.brand);
    }
}
