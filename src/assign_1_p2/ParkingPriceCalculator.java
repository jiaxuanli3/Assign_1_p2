import java.util.Scanner;

/**
 * @author Jia Xuan Li
 * @since 2021-09-27
 * @version 1.0
 */
public class ParkingPriceCalculator {
    /**
     * Find the price for a certain amount of parking time
     * @param args
     */
    public static void main(String[] args) {
        final double PRICE_PER_HOUR = 2;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please input the number of minutes your car has parked: ");

        int minutes = myScanner.nextInt();
        int hours = (int) Math.ceil(minutes / 60.0);
        double price = hours * PRICE_PER_HOUR;

        System.out.printf("%-25s: %d%n%-25s: %d%n%-25s: %.2f",
            "Parking time (minutes)", minutes,
            "Parking time (hour)", hours,
            "Price", price
        );
    }
}
