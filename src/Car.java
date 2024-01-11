public class Car {
    private int fuel_efficiency;
    private int fuel = 0;

    public Car(int fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
        System.out.println(fuel_efficiency + " miles per gallon");
    }

    public int getFuel_efficiency() {
        return fuel_efficiency;
    }

    public void setFuel_efficiency(int fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
    }
    public void addGas(int amount) {
        fuel += amount;
        System.out.println("Tank " + amount + " gallon");
    }
    public int getGasLevel(){
        return this.fuel;
    }
    public void drive (int distance) {
        int fuelConsumed = distance/fuel_efficiency;
        if (fuelConsumed <= fuel) {
            fuel -= fuelConsumed;
            System.out.println("Car drove " + distance + " mile. Fuel level is: " + fuel + " gallons");
        }else System.out.println("Not enough fuel");
    }
}
