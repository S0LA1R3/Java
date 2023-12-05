public class Car implements CarbonFootprint{
    private final String model;
    private final int fuelConsumption;
    private final FuelType fuelType;
    private final int engineEfficience;

    public Car(String model, int fuelConsumption, FuelType fuelType, int engineEfficience) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
        this.engineEfficience = engineEfficience;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getEngineEfficience() {
        return engineEfficience;
    }

    @Override
    public double getCarbonFootprint() {
        return fuelConsumption * fuelType.getCarbonRelease() / ((double) engineEfficience / 100);
    }

    @Override
    public String toString() {
        return String.format("Car Model: %s%nFuel Consumption: %s%nFuelType: %s%nEngine Efficience: %s",
        model, fuelConsumption, fuelType, engineEfficience);
    }
}
