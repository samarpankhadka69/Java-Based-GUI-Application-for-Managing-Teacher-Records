

 public class Tutor extends Teacher {
    // Additional attributes for Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Parameterized Constructor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        // Calling superclass constructor
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);
        // Initializing additional attributes
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // Accessor methods

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Getter for academicQualifications
    public String getAcademicQualifications() {
        return academicQualifications;
    }

    // Getter for performanceIndex
    public int getPerformanceIndex() {
        return performanceIndex;
    }

    // Getter for isCertified
    public boolean isCertified() {
        return isCertified;
    }

    // Mutator method for salary
    public void setSalary(double newSalary, int newPerformanceIndex)  {
        // Checking if salary can be approved
       
        if (newPerformanceIndex >5 && getWorkingHours() > 20) {
            double appraisal = 0;
            // Calculating appraisal based on performance index
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisal = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisal = 0.10;
            } else if (newPerformanceIndex == 10) {
                appraisal = 0.20;
            }

            // Calculating new salary
            salary = salary + (appraisal * salary);
           
            // Setting isCertified to true after appraisal
            isCertified = true;
        } else {
            System.out.println("Salary cannot be approved. Tutor does not meet criteria.");
        }
    }

    // Method to remove tutor
    public void removeTutor() {
        // Removing tutor only if not certified
        if (isCertified) {
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            isCertified = false;
        }
    }

    // Display method
    public void display() {
        // Checking if Tutor is certified
        if (!isCertified) {
            // If not certified, display details using superclass display method
            super.display();
        } else {
            super.display();
            // If certified, display additional details for Tutor
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}

