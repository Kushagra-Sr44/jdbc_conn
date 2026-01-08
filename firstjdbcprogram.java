import java.sql.*;
public class firstjdbcprogram {
        public static void main(String[] args) throws Exception {
            String url="jdbc:mysql://localhost:3306/student"; // database url
          String username="root"; // add user name
           String password="75812"; // add password
          String query="select * from student";

          Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established successfully");
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery(query);
            while (rs.next()) {
                int id=rs.getInt("stdid");// Retrieve name from db
                System.out.println(id);
                String name=rs.getString("name");// Retrieve name from db
                System.out.println(name);
               // Print result on console
            }

            // Close the statement and connection
           st.close();
            conn.close();
            System.out.println("Connection Closed....");
        }
    }


