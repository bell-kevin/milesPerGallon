package milespergallondriver;

public class MPG {

    private static double totalMiles, totalGallons, totalMPG;
    private static int numTrips;  
    private double miles, gallons, MPG;

    public MPG(double miles, double gallons) {
        this.miles = miles;
        this.gallons = gallons;
        this.MPG = miles / gallons;
        totalMiles += miles;
        totalGallons += gallons;
        numTrips++;
    }

    public void displayCurrentMPG() {
        System.out.printf("This trip = %-6.2f MPG\n", this.MPG);
    }

    public static void displayTotalMPG() {
        totalMPG = totalMiles / totalGallons;
        System.out.printf("For %d trips, total MPG = %-6.2f\n", numTrips, totalMPG);
    }
}
