import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UC6 {
    public void dbFunction(Connection connection) throws SQLException {
        String getQuery="select sum(salary) from employee_payroll where gender='M' group by gender";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(getQuery);
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        String getQuery1="select avg(salary) from employee_payroll where gender='M' group by gender";
        Statement statement1=connection.createStatement();
        ResultSet resultSet1=statement1.executeQuery(getQuery1);
        while(resultSet1.next()) {
            System.out.println(resultSet1.getString(1));
        }

        String getQuery2="select min(salary) from employee_payroll where gender='M' group by gender";
        Statement statement2=connection.createStatement();
        ResultSet resultSet2=statement2.executeQuery(getQuery2);
        while(resultSet2.next()) {
            System.out.println(resultSet2.getString(1));
        }

        String getQuery3="select max(salary) from employee_payroll where gender='M' group by gender";
        Statement statement3=connection.createStatement();
        ResultSet resultSet3=statement3.executeQuery(getQuery3);
        while(resultSet3.next()) {
            System.out.println(resultSet3.getString(1));
        }

        String getQuery4="select count(salary) from employee_payroll where gender='M' group by gender";
        Statement statement4=connection.createStatement();
        ResultSet resultSet4=statement4.executeQuery(getQuery4);
        while(resultSet4.next()) {
            System.out.println(resultSet4.getString(1));
        }

        getFemailDetails(connection);
    }

    private void getFemailDetails(Connection connection) throws SQLException {
        String getQuery="select sum(salary) from employee_payroll where gender='F' group by gender";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(getQuery);
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        String getQuery1="select avg(salary) from employee_payroll where gender='F' group by gender";
        Statement statement1=connection.createStatement();
        ResultSet resultSet1=statement1.executeQuery(getQuery1);
        while(resultSet1.next()) {
            System.out.println(resultSet1.getString(1));
        }

        String getQuery2="select min(salary) from employee_payroll where gender='F' group by gender";
        Statement statement2=connection.createStatement();
        ResultSet resultSet2=statement2.executeQuery(getQuery2);
        while(resultSet2.next()) {
            System.out.println(resultSet2.getString(1));
        }

        String getQuery3="select max(salary) from employee_payroll where gender='F' group by gender";
        Statement statement3=connection.createStatement();
        ResultSet resultSet3=statement3.executeQuery(getQuery3);
        while(resultSet3.next()) {
            System.out.println(resultSet3.getString(1));
        }

        String getQuery4="select count(salary) from employee_payroll where gender='F' group by gender";
        Statement statement4=connection.createStatement();
        ResultSet resultSet4=statement4.executeQuery(getQuery4);
        while(resultSet4.next()) {
            System.out.println(resultSet4.getString(1));
        }
    }
}