package by.ivan101454;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW", new Engine(1.8, "AWT", Fuel.GAS), new FuelTank());
        System.out.println(car.toString());
    }
}