package by.ivan101454;

public class MusicSystem {
    private String model;
    private Double power;
    private int Volume;
    private final int maxVolume = 100;
    private final int minVolume = 0;


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

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }
}
