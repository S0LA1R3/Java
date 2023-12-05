public enum FuelType {
    DIESEL(2),
    GASOLINE(3),
    ETANOL(1),
    GNV(4),
    GLP(5);

    private final int carbonRelease;

    FuelType(int carbonRelease) {
        this.carbonRelease = carbonRelease;
    }

    public int getCarbonRelease() {
        return carbonRelease;
    }
}