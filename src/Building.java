
public abstract class Building implements CarbonFootprint {
    private final String name;
    private final double energyConsumption;
    private final double fuelConsumption;
    private final FuelType fuelType;

    public Building(String name, double energyConsumption, double fuelConsumption, FuelType fuelType) {
        this.name = name;
        this.energyConsumption = energyConsumption;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return String.format("%s%nEnergy Consumption: %s%nFuel Consumption: %s%nFuel Type: %s",
        name, energyConsumption, fuelConsumption, fuelType);
    }
}
