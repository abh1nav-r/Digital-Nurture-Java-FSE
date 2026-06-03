import java.sql.*;

class StudentDAO {
    Connection con;

    StudentDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void insertStudent(int id, String name, int age) {
        try {
            String query = "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student inserted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void updateStudent(int id, String newName) {
        try {
            String query = "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, newName);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JDBCInserUpdate {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        dao.insertStudent(3, "Kiran", 20);

        dao.updateStudent(3, "Arun");
    }
}