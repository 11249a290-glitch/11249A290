import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:h2:mem:college;DB_CLOSE_DELAY=-1";
        String user = "sa";
        String password = "";

        String createTableSQL = "CREATE TABLE student (id INT PRIMARY KEY, name VARCHAR(50), department VARCHAR(50))";
        String insertSQL = "INSERT INTO student VALUES (101, 'Arun', 'CSE'), (102, 'Meena', 'IT'), (103, 'Karthik', 'ECE')";
        String selectSQL = "SELECT id, name, department FROM student";

        try {
            // Explicitly register H2 Driver
            Class.forName("org.h2.Driver");

            try (Connection con = DriverManager.getConnection(url, user, password);
                 Statement st = con.createStatement()) {

                st.execute(createTableSQL);
                st.execute(insertSQL);

                ResultSet rs = st.executeQuery(selectSQL);

                System.out.println("Student Details");
                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("department")
                    );
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class Not Found! Make sure JAR file is in current directory.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}