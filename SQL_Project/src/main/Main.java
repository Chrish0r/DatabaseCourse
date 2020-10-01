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

        // starting process of creating a table by calling required functionality
        try {
            dbStatement.createTable();
            System.out.println("SUCCESS: table created...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // starting process of inserting values into a table
        try {
            dbStatement.insertData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
