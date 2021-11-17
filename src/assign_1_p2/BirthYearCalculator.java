import java.util.Scanner;

/**
 * @author Jia Xuan Li
 * @since 2021-09-27
 * @version 1.0
 */
public class BirthYearCalculator {
    /**
     * Finds the century and the decade from a year of birth
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please input a birth year: ");

        String birthYear = myScanner.nextLine();

        // century: first two characters; decade: the third character
        String century = birthYear.substring(0, 2);
        String decade = birthYear.charAt(2) + "0";

        int centuryValue = Integer.parseInt(century);

        // without using modulo, look if it can be divided by 1000
        if (!birthYear.substring(1).equals("000")) {
            centuryValue++;
        }

        System.out.printf("%-10s: %s%n%-10s: %d%n%-10s: %s%n", 
            "Birth Year", birthYear,
            "Century", centuryValue,
            "Decade", decade
        );
    }
}
