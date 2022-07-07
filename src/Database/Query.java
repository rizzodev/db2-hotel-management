package Database;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Query {

    public Query() {
    }

    //Add Customer
    public void addCostumer(int customerID, String name, String gender, String country, String phone, String checkIn, String checkOut, int roomNumber) throws SQLException {
        Database db = new Database();
        String s = "INSERT INTO CUSTOMER (CUSTOMER_ID,NAME,GENDER,COUNTRY,PHONE,CHECK_IN,CHECK_OUT,ROOM_NUMBER) "
                + " VALUES (" + customerID + ",'" + name + "','" + gender + "','" + country + "','" + phone + "','" + checkIn + "','" + checkOut + "'," + roomNumber + ")";
        db.query(s);

    }

    //Add Payment
    public void addPayment(int customerID, int roomNumber, int total) throws SQLException {
        Database db = new Database();
        String s = "INSERT INTO PAYMENT (CUSTOMER_ID,ROOM_NUMBER,TOTAL) VALUES (" + customerID + "," + roomNumber + "," + total + ")";
        db.query(s);

    }

    //Edit Customer
    //1
    public void updateCustomer(int customerID, String name, String gender, String country, String phone, String checkIn, String checkOut, int roomNumber) throws SQLException {
        Database db = new Database();
        String s = "UPDATE CUSTOMER SET NAME = '" + name + "',GENDER = '" + gender + "' ,COUNTRY = '" + country + "' ,PHONE = '" + phone + "' ,CHECK_IN ='" + checkIn + "', CHECK_OUT = '" + checkOut + "',ROOM_NUMBER = " + roomNumber + "  WHERE CUSTOMER_ID =" + customerID;
        db.query(s);

    }

    //2
    public void updateCustomerPayment(int customerID, int roomNumber, int total) throws SQLException {
        Database db = new Database();
        String s = "UPDATE PAYMENT SET ROOM_NUMBER = " + roomNumber + ", TOTAL = " + total + " WHERE CUSTOMER_ID = " + customerID;
        db.query(s);

    }

    //Delete Customer
    //1
    public void deleteCustomer(int customerId) throws SQLException {
        Database db = new Database();
        String s = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = " + customerId;
        db.query(s);
    }

    //2
    public void deleteCustomerPayment(int customerId) throws SQLException {
        Database db = new Database();
        String s = "DELETE FROM PAYMENT WHERE CUSTOMER_ID = " + customerId;
        db.query(s);
    }

    //Customer Information
    public ResultSet customerInfo() {
        Database db = new Database();
        String s = "SELECT * FROM CUSTOMER";
        db.getData(s);
        return db.getData(s);
    }

    //Payment Information
    public ResultSet customerPaymentInfo() {
        Database db = new Database();
        String s = "SELECT P.NO_TRANS,P.CUSTOMER_ID,P.ROOM_NUMBER,C.CHECK_IN,C.CHECK_OUT,P.TOTAL FROM PAYMENT P INNER JOIN CUSTOMER C ON P.CUSTOMER_ID = C.CUSTOMER_ID INNER JOIN ROOM R ON P.ROOM_NUMBER = R.ROOM_NUMBER";
        db.getData(s);
        return db.getData(s);
    }

    //Room Info
    public ResultSet roomInfo() {
        Database db = new Database();
        String s = "SELECT R.ROOM_NUMBER,R.CLASS,RC.COST_PER_NIGHT FROM ROOM R LEFT JOIN ROOM_CLASS RC ON R.CLASS = RC.CLASS";
        db.getData(s);
        return db.getData(s);
    }

}
