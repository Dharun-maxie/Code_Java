package Jdbc;

import java.sql.*;
import static java.sql.DriverManager.getConnection;

public class JDBC {
    public static Connection con =null;

    public static void main(String[] args) throws Exception {

        String URL = "jdbc:mysql://localhost:3306/mydb";
        String User = "root";
        String Password = "Dharun@03";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = getConnection(URL, User, Password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT student_rank, student_id, student_name FROM STUDENT WHERE student_rank <= 5 order by student_rank;");

        while(rs.next()){
            System.out.println(STR."\{rs.getInt(1)} \{rs.getString(2)} \{rs.getString(3)} ");
        }

        st.close();
        con.close();
    }
}
