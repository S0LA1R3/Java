public class Industry extends Building {
    private final int chimneyFlow;

    public Industry(String name, double energyConsumption, double fuelConsumption,
    FuelType fuelType, int chimneyFlow) {
        super(name, energyConsumption, fuelConsumption, fuelType);

        this.chimneyFlow = chimneyFlow;
    }

    public int getChimneyFlow() {
        return chimneyFlow;
    }

    @Override
    public double getCarbonFootprint() {
        return getFuelConsumption() * 5 * getFuelType().getCarbonRelease() +
        getEnergyConsumption() * 2 + getChimneyFlow() * getFuelType().getCarbonRelease() * 6;
    }

    @Override
    public String toString() {
        return String.format("Industry: %s%nChimney Flow: %s",
        super.toString(), chimneyFlow);
    }
}
