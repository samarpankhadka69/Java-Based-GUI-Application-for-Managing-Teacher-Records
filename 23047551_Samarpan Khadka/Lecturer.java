public class Lecturer extends Teacher {
    // Additional attributes for Lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // Constructor
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            String department, int yearsOfExperience) {
        // Calling superclass constructor
        super(teacherId, teacherName, address, workingType, employmentStatus);
        // Initializing additional attribute
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    // Accessor methods

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for yearsOfExperience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // Getter for gradedScore
    public int getGradedScore() {
        return gradedScore;
    }

    // Getter for hasGraded
    public boolean gethasGraded() {
        return hasGraded;
    }

    // Mutator method for gradedScore
    public void setGradedScore(int score) {
        this.gradedScore = score;
    }

    // Method to grade assignments
    public void gradeAssignment(int score, String department, int yearsOfExperience) {
        // Checking if assignments can be graded
        if (yearsOfExperience >= 5 && this.department.equals(department)) {
            // Grading assignments based on criterias
            if (score >= 70) {
                System.out.println("You have scored A grade");
            } else if (score >= 60) {
                System.out.println("You have scored B grade");
            } else if (score >= 50) {
                System.out.println("You have scored C grade");
            } else if (score >= 40) {
                System.out.println("You have scored D grade");
            } else if (score>40){
                System.out.println("You have scored E grade");
            }
            this.hasGraded = true;
        } else {
            System.out.println("Cannot grade assignments.");
        }
    }

    // Display method
    public void display() {
        // Calling superclass display method
        super.display();
        // Displaying additional details for Lecturer
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        // Checking if assignments are graded
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        } else {
            System.out.println("Assignments not graded yet.");
        }
    }
}
