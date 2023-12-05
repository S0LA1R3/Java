public class CarbonFootprintTest {
    public static void main(String[] args) {
        CarbonFootprint[] envinronmentKillers = new CarbonFootprint[5];

        envinronmentKillers[0] = new Industry("Shaolas Inc.", 500132, 123213213,
        FuelType.DIESEL, 567);
        envinronmentKillers[1] = new Industry("SOLAS", 532, 123,
        FuelType.ETANOL, 23);
        envinronmentKillers[2] = new Commerce("Shaolas Atacados", 6723743, 6742677,
        FuelType.GNV, 324234);
        envinronmentKillers[3] = new Car("Supra", 32, FuelType.GASOLINE, 82);
        envinronmentKillers[4] = new Car("EuroTruck", 1234123, FuelType.GLP, 10);

        for(CarbonFootprint killer : envinronmentKillers) {
            System.out.printf("%n%s%nCarbon FootPrint: %.2f%n", killer, killer.getCarbonFootprint());
        }
    }
}
