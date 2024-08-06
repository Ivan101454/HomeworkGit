package by.ivan101454;

import jdk.incubator.vector.VectorOperators;

public class Engine {
    private double displacement;
    private String numberEngine;
    private Enum<Fuel> typeEngine;

    public Engine(double displacement, String numberEngine, Enum<Fuel> typeEngine) {
        this.displacement = displacement;
        this.numberEngine = numberEngine;
        this.typeEngine = typeEngine;
    }

    public void startEngine() {
        System.out.println("Двигатель заведен");
    }

    public void stopEngine() {
        System.out.println("Двигатель заглушен");
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
