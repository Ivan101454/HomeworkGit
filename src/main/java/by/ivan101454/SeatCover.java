package by.ivan101454;

public class SeatCover {
    private String color;
    private String material;

    public SeatCover(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public void turnOffHeater() {
        System.out.println("Подогрев выключен");
    }
    public void turnOnHeater() {
        System.out.println("Подогрев включен");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
