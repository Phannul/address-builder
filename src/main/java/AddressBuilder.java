import java.util.Scanner;

public class AddressBuilder {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
       String[] billingData = billingPrompt();
       String[] shippingData = shippingPrompt();

       StringBuilder finalOutput = new StringBuilder();


       finalOutput.append(("Final Address Confirmation \n"));
       finalOutput.append("Billing Address \n");
       finalOutput.append(billingData[0] + "\n");
       finalOutput.append(billingData[1] + "\n");
       finalOutput.append(billingData[2] + "\n");
       finalOutput.append(billingData[3] + "\n");
       finalOutput.append(billingData[4] + "\n");
       finalOutput.append("Shipping Address\n");
       finalOutput.append(shippingData[0]+ "\n");
       finalOutput.append(shippingData[1]+ "\n");
       finalOutput.append(shippingData[2] + "\n");
       finalOutput.append(shippingData[3] + "\n");

       System.out.println(finalOutput.toString());





    }

    public static String [] billingPrompt() {
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
        return new String[] {fullName, billingStreet, billingCity, billingState, billingZip };
    }
    public static String [] shippingPrompt() {
        System.out.println("Let's start with you shipping address \nShipping Street: ");
        String shippingStreet = myScanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

        return new String[] {shippingStreet, shippingCity, shippingState, shippingZip};

    }
}
