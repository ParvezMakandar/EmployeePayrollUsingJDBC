import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UC2 {

    String select = "select * from employee_payroll";

    public void retriveData(Connection connect) {
        try {
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(select);
            while (resultSet.next()) {
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
