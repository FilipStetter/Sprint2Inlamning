import java.time.LocalDate;

public class Customer  {
    private String name;
    private String SocialSecurity;
    private LocalDate lastPaymentDate;
    public  Customer(LocalDate lastPaymentDate){
         this.lastPaymentDate = lastPaymentDate;
    }
    public Customer(String name, LocalDate lastPaymentDate) {
        this.name = name.substring(12);
        this.lastPaymentDate = lastPaymentDate;
        this.SocialSecurity = name.substring(0, 10); // Assuming the personal number is the first 10 characters of the name
    }
    public Customer(String name) {
        this.name = name;
        this.SocialSecurity = name.substring(0, 10); // Assuming the personal number is the first 10 characters of the name
    }
    public String getName() {
        return name;
    }



    public String getSocialSecurity() {
        return SocialSecurity;
    }

    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }
}

