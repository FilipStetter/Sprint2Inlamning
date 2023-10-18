import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerUtilsTest {


    @Test
    public void testGetCustomerCategory_CurrentMember() {
        LocalDate lastPaymentDate = LocalDate.now().minusMonths(6);
        Customer customer = new Customer("Elmer Ekorrsson" ,lastPaymentDate);

        String category = CustomerUtils.getCustomerCategory(customer);

        assertEquals("Nuvarande medlem", category);
        System.out.println(category);
    }

    @Test
    public void testGetCustomerCategory_FormerCustomer() {

        LocalDate lastPaymentDate = LocalDate.now().minusMonths(13);
        Customer customer = new Customer("Fritjoff Flacon", lastPaymentDate);

        String category = CustomerUtils.getCustomerCategory(customer);

        assertEquals("Före detta kund", category);
        System.out.println(category);
    }
}
