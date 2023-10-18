import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerUtils {
    public static String getCustomerCategory(Customer customer) {
        LocalDate currentDate = LocalDate.now();
        LocalDate lastPaymentDate = customer.getLastPaymentDate();
        long monthsSinceLastPayment = lastPaymentDate.until(currentDate).toTotalMonths();

        if (monthsSinceLastPayment < 12) {
            return "Nuvarande medlem";
        } else {
            return "Före detta kund";
        }
    }
}
