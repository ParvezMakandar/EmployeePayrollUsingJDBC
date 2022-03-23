import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UC3 {
    String updateQuery="update employee_payroll set basicpay=3000000 where empName='Terisa'";
    public void updateDetail(Connection connection) {
        try {
            Statement statement=connection.createStatement();
            statement.executeUpdate(updateQuery);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}