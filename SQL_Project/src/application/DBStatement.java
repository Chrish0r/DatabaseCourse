package application;

import dbUtil.DBConnection;

import java.sql.*;

/**
 * This class is responsible for providing common sql instructions -> CRUD and more:
 *    -> CREATE, Read (SELECT), UPDATE, DELETE, etc.
 *
 * @author      Przemyslaw Christof Gadek
 */
public class DBStatement {
    //------------------db elements--------------------------------------------------
    private DBConnection dbConnection = new DBConnection();

    private Connection connection = null; // connection to data base
    private Statement statement = null;   // sends sql instructions to database
    private PreparedStatement preparedStatement = null; // sends sql instructions to database
    private ResultSet resultSet = null;   // returned results of the previously sent sql instruction

    //-------------------logic / methods----------------------------------------------
    public boolean checkDBConnection() throws SQLException {
        connection = dbConnection.getConnection();

        if(connection != null) {
            return true;
        } else {
            return false;
        }
    }

                    // create table -> CREATE
    private final String TABLE_USER = "User";

    private final String COLUMN_ID = "ID";
    private final String COLUMN_NAME = "Name";
    private final String COLUMN_EMAIL = "Email";
    private final String COLUMN_TELNUMBER = "Tel_Number";
    private final String COLUMN_COUNTRY = "Country";
    private final String COLUMN_DATE = "Registration_Date";

    public void createTable() throws SQLException {
        String createTable = "CREATE TABLE IF NOT EXISTS " + TABLE_USER
                + "( "
                    + COLUMN_ID + " INTEGER PRIMARY KEY, "
                    + COLUMN_NAME + " TEXT NOT NULL, "
                    + COLUMN_EMAIL + " TEXT UNIQUE NOT NULL, "
                    + COLUMN_TELNUMBER + " TEXT NULL, " // User does not need to provide his phone number
                    + COLUMN_COUNTRY + " TEXT NOT NULL, "
                    + COLUMN_DATE + " TEXT NULL "
                + ")";

        try {
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            if(statement != null) {
                statement.execute(createTable);
            }

        } finally {
            statement.close(); // saves ressources
            /*
     -> order important: closing statement before closing connection, otherwise
        connection is gone and closing statement would not work anymore without connection.
             */
            connection.close(); // saves ressources
        }

    }

                // insert values into table i.e. into columns
    public void insertData() throws SQLException {
        String insertData = "INSERT INTO " + TABLE_USER + " VALUES "
                + "(NULL, 'Chris', 'chrissa@mail.de', '0152/43245692', 'Germany', "
                + "DATETIME('now', 'localtime'))";

        try {
            connection = dbConnection.getConnection();
            statement = connection.createStatement();
            if(statement != null) {
                statement.execute(insertData);
            }
        } finally {
            statement.close();
            connection.close();
        }

    }



}
