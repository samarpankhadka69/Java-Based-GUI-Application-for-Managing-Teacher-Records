 public class Teacher {
    // Attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        // Initializing attributes
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = 0; // Default value, not assigned yet
    }

    // Accessor methods

    // Getter for teacherId
    public int getTeacherId() {
        return teacherId;
    }

    // Getter for teacherName
    public String getTeacherName() {
        return teacherName;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for workingType
    public String getWorkingType() {
        return workingType;
    }

    // Getter for employmentStatus
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    // Getter for workingHours
    public int getWorkingHours() {
        return workingHours;
    }

    // Mutator method for workingHours
    public void setWorkingHours(int hours) {
        this.workingHours = hours;
    }

    // Display method
    public void display() {
        // Displaying teacher details
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);

        // Checking if working hours are assigned
        if (workingHours == 0) {
            System.out.println("Working Hours: Not assigned yet");
        } else {
            System.out.println("Working Hours: " + workingHours);
        }
    }
}










