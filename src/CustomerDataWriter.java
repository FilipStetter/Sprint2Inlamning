import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerDataWriter {
    public static void saveTrainingData(String filename, Customer customer) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(customer.getSocialSecurity() + ", " + customer.getName() + "\n");
            writer.write(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
        }
    }
}
