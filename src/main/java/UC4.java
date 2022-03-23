import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UC4 {

    String updateQuery="update employee_payroll set salary=5000000 where empname='Terisa'";
    String select="select * from employee_payroll where empname='Terisa'";
    public void updateSalary(Connection connection) {
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
            preparedStatement.execute();
            preparedStatement=connection.prepareStatement(select);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
                        + "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5) + "\t" + resultSet.getString(6)
                        + "\t" + resultSet.getString(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)
                        + "\t" + resultSet.getString(10)+"\t"+resultSet.getString(11)+"\t"+resultSet.getString(12));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}