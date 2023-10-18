import java.util.List;

public class CustomerFinder {
    public static Customer findCustomer(String input, List<Customer> customers) {
        for (Customer customer : customers) {
            if (input.equals(customer.getName()) || input.equals(customer.getSocialSecurity())) {
                return customer;
            }
        }
        // Om ingen kund hittades, försök söka med personnummer separat
        for (Customer customer : customers) {
            if (input.equals(customer.getSocialSecurity())) {
                return customer;
            }
        }
        return null;
    }
}
