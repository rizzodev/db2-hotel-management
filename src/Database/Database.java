package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author db2inst226
 */
public class Database {

    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection connection = null;

    //Konstruktor
    public Database() {
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://localhost:50000/SMH";
            //change to valid username and password 
            connection = DriverManager.getConnection(url, "db2inst226", "bismillah");
            stmt = connection.createStatement();                                        // ambil statement

            if (connection.equals(null)) {
                System.out.println("connection was failed");
            } else {
                System.out.println("connected successfully");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //method 
    //resultSet
    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    //query 
    public void query(String SQLString) throws SQLException {
        stmt.executeUpdate(SQLString);
    }

    public Connection getCon() {
        Connection con;
        con = this.connection;
        return con;
    }
}
