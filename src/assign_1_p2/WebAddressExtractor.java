import java.util.Scanner;

/**
 * @author Jia Xuan Li
 * @since 2021-09-27
 * @version 1.0
 */
public class WebAddressExtractor {
    /**
     * Extracts components of a web address (heading, company, extension)
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a web address: ");

        String webAddress = myScanner.nextLine().toLowerCase();
        String[] webAddressParts = webAddress.split("\\.");

        String heading = webAddressParts[0];
        String company = webAddressParts[1];
        String extension = webAddressParts[2];

        System.out.printf("%-10s: %s%n%-10s: %s%n%-10s: %s%n%-10s: %s", 
            "Address", webAddress, 
            "Heading", heading, 
            "Company", company, 
            "Extension", extension
        );
    }
}