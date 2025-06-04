package Day12;

import java.util.Optional;
import java.util.Scanner;

class email {
    Optional<String> email;

    email(String email) {
        this.email = Optional.ofNullable(email);
    }

    void display() {
        email.ifPresent(e -> System.out.println("Sending email to: " + e));
    }
}

public class EmailNotification {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email ");
        String emailInput = s.nextLine();

      String email = emailInput.isEmpty() ? null : emailInput;

        email u = new email(emailInput);
        u.display();
        
        s.close(); 
    }
}
