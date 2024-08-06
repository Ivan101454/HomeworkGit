package by.ivan101454;

public class Railing {
    String color;

    public Railing(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setBaggage() {
        System.out.println("Багаж установлен на машину");
    }

    @Override
    public String toString() {
        return "Railing{" +
               "color='" + color + '\'' +
               '}';
    }
}
