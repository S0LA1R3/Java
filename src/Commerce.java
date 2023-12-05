public class Commerce extends Building {
    private final int freightQuantity;

    public Commerce(String name, double energyConsumption, double fuelConsumption,
    FuelType fuelType, int freightQuantity) {
        super(name, energyConsumption, fuelConsumption, fuelType);

        this.freightQuantity = freightQuantity;
    }

    public int getFreightQuantity() {
        return freightQuantity;
    }

    @Override
    public double getCarbonFootprint() {
        return getEnergyConsumption() * 4 + getFuelConsumption() * 2 * getFuelType().getCarbonRelease() +
        freightQuantity * getFuelType().getCarbonRelease() * 5;
    }

    @Override
    public String toString() {
        return String.format("Commerce: %s%nFreight Quantity: %s",
        super.toString(), freightQuantity);
    }
}
