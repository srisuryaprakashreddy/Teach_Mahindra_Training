package Day12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkingHoursChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalTime startTime = LocalTime.of(9, 0);   
        LocalTime endTime = LocalTime.of(17, 0);    

        System.out.print("Enter time in HH:mm format (e.g., 14:30): ");
        String input = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime enteredTime = LocalTime.parse(input, formatter);

            if (!enteredTime.isBefore(startTime) && !enteredTime.isAfter(endTime)) {
                System.out.println("Entered time is within working hours.");
            } else {
                System.out.println("Entered time is outside working hours.");
            }

        } catch (Exception e) {
            System.out.println("Invalid time format. Please enter time as HH:mm.");
        }

        scanner.close();
    }
}

