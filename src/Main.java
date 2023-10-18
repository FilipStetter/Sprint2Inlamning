import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        try {
            List<Customer> customers = CustomerDataLoader.readCustomerData("personposter.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter social security number or name: ");
            String input = scanner.nextLine();

            Customer customer = CustomerFinder.findCustomer(input, customers);

            if (customer != null) {
                System.out.println("Customer category: " + CustomerUtils.getCustomerCategory(customer));
                CustomerDataWriter.saveTrainingData("PTfil.txt", customer);
            } else {
                System.out.println("Customer not found in our system and is unauthorized.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}