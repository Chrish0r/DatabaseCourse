package main;

import application.DBStatement;
import org.sqlite.core.DB;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // dbStatement regulates communication to server
        DBStatement dbStatement = new DBStatement();

        // check connection
        try {
            dbStatement.checkDBConnection();
            System.out.println("connection established...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
