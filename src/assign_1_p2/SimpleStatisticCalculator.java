import java.util.Scanner;

/**
 * @author Jia Xuan Li
 * @since 2021-09-27
 * @version 1.0
 */
public class SimpleStatisticCalculator {
    /**
     * Finds the mean, the min and max, and the standard deviation from 5 numbers
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Please enter 5 numbers separated by space: ");

        Scanner myScanner = new Scanner(System.in);

        String[] numbers = myScanner.nextLine().split("\\s");

        // create a double array of numbers, to avoid using strings all the time
        double[] numberValues = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            numberValues[i] = Double.parseDouble(numbers[i]);
        }

        // declare initial values
        double numbersSum = 0;
        double maximum = numberValues[0];
        double minimum = numberValues[0];
        double standardDeviation = 0;

        // iterate through numbers and calculate 
        for (double number: numberValues) {
            // add the number to the sum, to find the average and the standard deviation
            numbersSum += number;

            // find the max and min in the same loop to save time
            if (number > maximum) maximum = number;
            if (number < minimum) minimum = number;
        }

        // find the mean by dividing the sum by 5 (amount of numbers)
        double mean = numbersSum / 5;

        for (double number: numberValues) {
            standardDeviation += Math.pow(number - mean, 2);
        }

        standardDeviation = Math.sqrt(standardDeviation / 5);

        System.out.printf("%-10s: %.2f, %.2f, %.2f, %.2f, %.2f%n%-10s: %.2f%n%-10s: %.2f%n%-10s: %.2f%n%-10s: %.2f", 
            "Numbers", numberValues[0], numberValues[1], numberValues[2], numberValues[3], numberValues[4],
            "Mean", mean,
            "Minimum", minimum,
            "Maximum", maximum,
            "Standard Deviation", standardDeviation
        );
    }
}
