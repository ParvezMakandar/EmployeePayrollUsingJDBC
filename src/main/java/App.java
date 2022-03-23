import java.sql.SQLException;

public class App {
    static UC1 uc1 = new UC1();
    static UC2 uc2 = new UC2();
    static UC3 uc3 = new UC3();
    static UC4 uc4 = new UC4();
    static UC5 uc5 = new UC5();
    static UC6 uc6 = new UC6();

    static getConnection connection = new getConnection();
    static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    static final String USERNAME = "root";
    static final String PASSWORD = "Kingofgoogle5";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        uc1.checkForConnection(URL, USERNAME, PASSWORD);
        uc2.retriveData(connection.connect());
        uc3.updateDetail(connection.connect());
        uc4.updateSalary(connection.connect());
        uc5.getData(connection.connect());
        uc6.dbFunction(connection.connect());
    }
}
