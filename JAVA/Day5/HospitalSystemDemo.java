package Day5;

//--- Hospital System: Interface ---
interface Shift {
 String getShiftTiming();
}

//--- Hospital System: Abstract Class ---
abstract class HospitalRole {
 public abstract void performDuties();
 public abstract String getName(); // Abstract to force subclasses to provide a name getter

 public void reportToWork() {
     System.out.println(getName() + " is reporting for duty.");
 }
}

//--- Hospital System: Base Class ---
abstract class Staff extends HospitalRole implements Shift {
 private String name;
 private String id;
 protected double baseSalary; // Protected to allow direct use in subclass salary calculations

 public Staff(String name, String id, double baseSalary) {
     this.name = name;
     this.id = id;
     this.baseSalary = baseSalary;
 }

 // Encapsulated fields with public getters
 @Override
 public String getName() {
     return name;
 }

 public String getId() {
     return id;
 }

 // Abstract method: Each staff type must define how their salary is calculated
 public abstract double calculateSalary();

 // Abstract methods from interface and abstract class to be implemented by concrete staff types
 @Override
 public abstract String getShiftTiming();

 @Override
 public abstract void performDuties();
}

//--- Hospital System: Subclasses ---
class Doctor extends Staff {
 private String specialty;
 private int surgeriesPerformed;
 private static final double SURGERY_BONUS_RATE = 500.0; // Example bonus

 public Doctor(String name, String id, double baseSalary, String specialty, int surgeriesPerformed) {
     super(name, id, baseSalary);
     this.specialty = specialty;
     this.surgeriesPerformed = surgeriesPerformed;
 }

 // Encapsulation
 public String getSpecialty() {
     return specialty;
 }

 public int getSurgeriesPerformed() {
     return surgeriesPerformed;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + (surgeriesPerformed * SURGERY_BONUS_RATE);
 }

 @Override
 public String getShiftTiming() {
     return "Day Shift (8:00 AM - 4:00 PM)";
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " (" + getSpecialty() + ") is performing rounds and surgeries.");
 }
}

class Nurse extends Staff {
 private int hoursWorked;
 private static final double HOURLY_RATE = 30.0; // Example hourly rate

 public Nurse(String name, String id, double baseSalary, int hoursWorked) {
     super(name, id, baseSalary); // baseSalary might be 0 or a very small base for hourly staff
     this.hoursWorked = hoursWorked;
 }

 // Encapsulation
 public int getHoursWorked() {
     return hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hoursWorked * HOURLY_RATE;
 }

 @Override
 public String getShiftTiming() {
     return "Rotating Shifts (Day, Evening, Night)";
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is administering medication and providing patient care.");
 }
}

class AdminStaff extends Staff {
 private String department;
 private double bonus;

 public AdminStaff(String name, String id, double baseSalary, String department, double bonus) {
     super(name, id, baseSalary);
     this.department = department;
     this.bonus = bonus;
 }

 // Encapsulation
 public String getDepartment() {
     return department;
 }

 public double getBonus() {
     return bonus;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + bonus;
 }

 @Override
 public String getShiftTiming() {
     return "Day Shift (9:00 AM - 5:00 PM)";
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " (Admin) is managing " + getDepartment() + " operations.");
 }
}

//--- Hospital System: Demonstration Class ---
class HospitalSystemDemo {
 public static void main(String[] args) {
     java.util.List<Staff> hospitalStaff = new java.util.ArrayList<>();

     // Creating staff instances
     hospitalStaff.add(new Doctor("Dr. Anya Sharma", "D001", 60000.0, "Cardiology", 10));
     hospitalStaff.add(new Nurse("Nurse Ben Carter", "N005", 0.0, 160));
     hospitalStaff.add(new AdminStaff("Ms. Clara Jones", "A010", 4000.0, "HR", 500.0));
     hospitalStaff.add(new Doctor("Dr. David Lee", "D002", 58000.0, "Pediatrics", 5));
     hospitalStaff.add(new Nurse("Nurse Emily White", "N008", 0.0, 180));

     System.out.println("--- Hospital Staff Details and Duties ---");
     for (Staff staff : hospitalStaff) {
         System.out.println("\n------------------------------------");
         System.out.println("Name: " + staff.getName() + " (ID: " + staff.getId() + ")");

         // Demonstrating polymorphism: The correct calculateSalary() is called
         System.out.printf("Calculated Salary: Rs. %.2f%n", staff.calculateSalary());

         // Demonstrating polymorphism for interface method
         System.out.println("Shift: " + staff.getShiftTiming());

         // Demonstrating polymorphism for abstract method
         staff.performDuties();

         // Demonstrating concrete method from abstract superclass
         staff.reportToWork();
     }
     System.out.println("\n--- End of Hospital Staff Report ---");
 }
}