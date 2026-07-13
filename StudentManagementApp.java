import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== STUDENT REGISTRATION SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Pincode: ");
                    String pincode = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("Department: ");
                    String department = sc.nextLine();

                    System.out.print("Semester: ");
                   int semester = Integer.parseInt(sc.nextLine());
                    System.out.print("CGPA: ");
                    double cgpa = Double.parseDouble(sc.nextLine());

                    sc.nextLine();

                    System.out.print("Guardian Name: ");
                    String guardianName = sc.nextLine();

                    System.out.print("Guardian Phone: ");
                    String guardianPhone = sc.nextLine();

                    Student student =
                            new Student(
                                    firstName,
                                    lastName,
                                    gender,
                                    email,
                                    phone,
                                    address,
                                    city,
                                    state,
                                    pincode,
                                    course,
                                    department,
                                    semester,
                                    cgpa,
                                    guardianName,
                                    guardianPhone
                            );

                    dao.addStudent(student);

                    break;

                case 2:

                    dao.viewStudents();

                    break;

                case 3:

                    System.exit(0);
            }
        }
    }
}