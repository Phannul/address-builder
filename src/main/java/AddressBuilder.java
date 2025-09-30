import java.util.Scanner;

public class AddressBuilder {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        billingPrompt(myScanner);
        shippingPrompt(myScanner);

    }

    public static void billingPrompt(Scanner myScanner) {
        System.out.println("Please provide the following Information: \nFull Name ");
        String fullName = myScanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = myScanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine();
    }
    public static void shippingPrompt(Scanner myScanner) {
        System.out.println("Let's start with you shipping address \nShipping Street: ");
        String shippingStreet = myScanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

    }
}
