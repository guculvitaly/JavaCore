package com.hillel.gucul.vitaly.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.sql.*;

/**
 * Created by insomnia on 23.09.17.
 */
public class DataBaseExample {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hillelok";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        try {
            DataBaseExample.getDBConnection();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Connection getDBConnection() throws ParseException {

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
            createDbUserTable(connection);
            return connection;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } return null;
    }

    private static void createDbUserTable(Connection connection) throws SQLException, ParseException {

        String createTableSQL = "CREATE TABLE DBUSER(USER_ID INT(5) NOT NULL,)"
                + "USERNAME VARCHAR(20) NOT NULL, "
                + "CREATED_BY VARCHAR(20) NOT NULL, "
                + "PRIMARY KEY (USER_ID) "
                + ")";

        try (Statement statement = connection.createStatement()) {

            statement.execute(createTableSQL);
                insertDataIntoDB(statement);
//                selectFromTable(statement);
//                deleteFromTable(statement);

            System.out.println("Table \"dbuser\" is created! ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void insertDataIntoDB(Statement statement) throws ParseException {
        String insertTableSQL = "INSERT INTO DBUSER"
                + "(USER_ID, USERNAME, CREATED_BY) " + "VALUES"
                + "(1, 'vetal' , 'system')";

        try {
            statement.executeUpdate(insertTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static  void selectFromTable(Statement statement) {
        String selectTableSQL = "SELECT USER_ID, USERNAME from DBUSER";

    }
}
