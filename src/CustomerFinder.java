import java.util.List;

public class CustomerFinder {
    public static Customer findCustomer(String input, List<Customer> customers) {
        for (Customer customer : customers) {
            if (input.equals(customer.getName()) || input.equals(customer.getSocialSecurity())) {
                return customer;
            }
        }
        for (Customer customer : customers) {
            if (input.equals(customer.getSocialSecurity())) {
                return customer;
            }
        }
        return null;
    }
}
