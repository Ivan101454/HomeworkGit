package by.ivan101454;

public class Engine {
    private double displacement;
    private String numberEngine;
    private Enum<Fuel> typeEngine;

    public Engine(double displacement, String numberEngine, Enum<Fuel> typeEngine) {
        this.displacement = displacement;
        this.numberEngine = numberEngine;
        this.typeEngine = typeEngine;
    }
}
