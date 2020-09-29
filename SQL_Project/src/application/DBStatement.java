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
}
