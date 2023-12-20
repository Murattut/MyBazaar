package Users;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String email;
    private LocalDate date_of_birth;

    public Person(String name, String email, String date_of_birth){
        this.name =name;
        this.email = email;
        this.date_of_birth = LocalDate.parse(date_of_birth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }
    /*
    public void displayPersonalData() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + date_of_birth);
    }*/
}
