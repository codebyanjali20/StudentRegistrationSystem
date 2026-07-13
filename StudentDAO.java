import java.sql.*;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
        "INSERT INTO students(first_name,last_name,gender,email,phone,address,city,state,pincode,course,department,semester,cgpa,guardian_name,guardian_phone) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getGender());
            ps.setString(4, student.getEmail());
            ps.setString(5, student.getPhone());
            ps.setString(6, student.getAddress());
            ps.setString(7, student.getCity());
            ps.setString(8, student.getState());
            ps.setString(9, student.getPincode());
            ps.setString(10, student.getCourse());
            ps.setString(11, student.getDepartment());
            ps.setInt(12, student.getSemester());
            ps.setDouble(13, student.getCgpa());
            ps.setString(14, student.getGuardianName());
            ps.setString(15, student.getGuardianPhone());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void viewStudents() {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM students");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("student_id")
                                + " | "
                                + rs.getString("first_name")
                                + " "
                                + rs.getString("last_name")
                                + " | "
                                + rs.getString("course")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}