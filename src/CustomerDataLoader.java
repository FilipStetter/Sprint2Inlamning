import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerDataLoader {
    public static List<Customer> readCustomerData(String filename) throws IOException {
        List<Customer> customers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String currentLine = "";
            while ((line = reader.readLine()) != null) {
                if (line.matches("^\\d{10}, .+")) {
                    currentLine = line;
                    line = reader.readLine();
                    LocalDate lastPaymentDate = LocalDate.parse(line, DateTimeFormatter.ISO_LOCAL_DATE);
                    customers.add(new Customer(currentLine, lastPaymentDate));

                } else if (line.matches("^\\d{4}-\\d{2}-\\d{2}")) {
                    String name = currentLine.split(", ")[1];
                    String lastPaymentDateString = line;
                    LocalDate lastPaymentDate = LocalDate.parse(lastPaymentDateString, DateTimeFormatter.ISO_LOCAL_DATE);
                    customers.add(new Customer(name, lastPaymentDate));

                }
            }
        }
        return customers;
    }
}
