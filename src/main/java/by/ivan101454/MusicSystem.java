package by.ivan101454;

public class MusicSystem {
    private String model;
    private Double power;

    public MusicSystem(String model, Double power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }
}
