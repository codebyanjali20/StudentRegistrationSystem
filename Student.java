public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String course;
    private String department;
    private int semester;
    private double cgpa;
    private String guardianName;
    private String guardianPhone;

    public Student(
            String firstName,
            String lastName,
            String gender,
            String email,
            String phone,
            String address,
            String city,
            String state,
            String pincode,
            String course,
            String department,
            int semester,
            double cgpa,
            String guardianName,
            String guardianPhone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.course = course;
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.guardianName = guardianName;
        this.guardianPhone = guardianPhone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getPincode() { return pincode; }
    public String getCourse() { return course; }
    public String getDepartment() { return department; }
    public int getSemester() { return semester; }
    public double getCgpa() { return cgpa; }
    public String getGuardianName() { return guardianName; }
    public String getGuardianPhone() { return guardianPhone; }
}