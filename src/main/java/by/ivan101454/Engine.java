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

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getNumberEngine() {
        return numberEngine;
    }

    public void setNumberEngine(String numberEngine) {
        this.numberEngine = numberEngine;
    }

    public Enum<Fuel> getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(Enum<Fuel> typeEngine) {
        this.typeEngine = typeEngine;
    }
}
