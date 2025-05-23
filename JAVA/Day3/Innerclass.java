package Day3;


public class Innerclass {
    private String collegeName;
    private String location;
    private int establishedYear;

    public Innerclass(String collegeName, String location, int establishedYear) {
        this.collegeName = collegeName;
        this.location = location;
        this.establishedYear = establishedYear;
        System.out.println("College created: " + collegeName);
    }

    // --- Inner Class: Department ---
    // A Department logically belongs to a College instance.
    // It can access all members (even private ones) of the outer College class.
    public class Department {
        private String departmentName;
        private int numberOfFaculty;

        public Department(String departmentName, int numberOfFaculty) {
            this.departmentName = departmentName;
            this.numberOfFaculty = numberOfFaculty;
            System.out.println("  Department '" + departmentName + "' created within " + collegeName);
        }

        public void displayDepartmentInfo() {
            // The inner class can directly access private fields of the outer class
            System.out.println("\n--- Department Details ---");
            System.out.println("  College: " + collegeName + " (Established: " + establishedYear + ")");
            System.out.println("  Location: " + location);
            System.out.println("  Department Name: " + departmentName);
            System.out.println("  Number of Faculty: " + numberOfFaculty);
            System.out.println("--------------------------");
        }
    } // End of Inner Class Department

    // Method to create and return a new Department for this College
    public Department createDepartment(String deptName, int facultyCount) {
        // Instantiate the inner class using 'this.new'
        return this.new Department(deptName, facultyCount);
    }

    public static void main(String[] args) {
        // 1. Create a College instance
    	Innerclass myCollege = new Innerclass("Tech University", "Silicon Valley", 1990);

        // 2. Create Department instances associated with 'myCollege'
        // We use the createDepartment method of the College object
    	Innerclass.Department csDept = myCollege.createDepartment("Computer Science", 50);
    	Innerclass.Department eeDept = myCollege.createDepartment("Electrical Engineering", 45);

        // 3. Display information for each department
        csDept.displayDepartmentInfo();
        eeDept.displayDepartmentInfo();

        // --- Another College Example ---
        System.out.println("\nCreating another college...");
        Innerclass artsCollege = new Innerclass("Arts & Humanities College", "Downtown City", 1885);
        Innerclass.Department historyDept = artsCollege.createDepartment("History", 20);
        historyDept.displayDepartmentInfo();

        // Important: You cannot create a Department without a College instance
        // College.Department physicsDept = new College.Department("Physics", 30); // COMPILE ERROR!
        // You would need an instance like:
        // College tempCollege = new College("Temp", "Loc", 2000);
        // College.Department physicsDept = tempCollege.new Department("Physics", 30);
    }
}