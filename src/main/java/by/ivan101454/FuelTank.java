package by.ivan101454;
public class FuelTank {
   private final int maxSize = 60;
   private int currentAmountFuel = 0;

   public FuelTank() {

   }

    public int getCurrentAmountFuel() {
        return currentAmountFuel;
    }

    public void setCurrentAmountFuel(int currentAmountFuel) {
        this.currentAmountFuel = currentAmountFuel;
    }
}
