import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UC1 {

    public void checkForConnection(String url, String userName, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

        } catch (ClassNotFoundException e1) {
            System.out.println("Driver is not loaded");
            e1.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Database is connected");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("database is not connected");

        }

    }

}