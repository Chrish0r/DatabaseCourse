package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_NAME = "Userdata.sqlite";
    private static final String PATH = "C:\\Repositories\\DatabaseCourse\\SQL_Project\\src\\";

    private static final String CONNECTION_STRING = "jdbc:sqlite:" + PATH + DB_NAME;

    // create db i.e. connection to db
    public Connection getConnection() throws SQLException {
        Connection connection = null;

        connection = DriverManager.getConnection(CONNECTION_STRING);

        return connection;
    }
}
