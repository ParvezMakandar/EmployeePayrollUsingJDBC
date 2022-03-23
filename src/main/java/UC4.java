import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UC4
{

    String updateQuery="update employee_payroll set salary=5000000 where empname='Terisa'";

    public void updateSalary(Connection connection) {
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
            preparedStatement.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
