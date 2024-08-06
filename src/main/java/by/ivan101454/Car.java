package by.ivan101454;

public class Car {
    private String model;
    private Engine engine;
    private FuelTank fuelTank;
    public Car(String model, Engine engine, FuelTank fuelTank) {
        this.model = model;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void fillFuel() {
        fuelTank.setCurrentAmountFuel(fuelTank.getMaxSize());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", engine=" + engine +
               ", fuelTank=" + fuelTank +
               '}';
    }
}
