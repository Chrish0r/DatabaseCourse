package test;

import java.sql.*;

public class Main {
	
	public static final String DB_NAME = "kontakte.de";
	// Falls DB noch nicht exisitiert, wird sie dort erstellt
	public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\User\\Desktop\\Studium-OTH\\Lernplan\\Semester-4\\Java_DB_Kurs\\DatabaseCourse\\DatabaseTest\\src\\test\\" + DB_NAME;
	
	// Name der Tabellen in unserer Datenbank
	public static final String TABLE_KONTAKT = "kontakte";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_PHONE = "phone";
	public static final String COLUMN_EMAIL = "email";
	
    public static void main(String[] args) {
    	// Verbindung zur DB erstellen - falls DB noch nicht existiert, dann wird sie erzeugt
    	String url = CONNECTION_STRING;
    	try {
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * CRUD Methoden
     */
    
    private static void createContact() {
    	
    }
    
 private static void readContact() {
    	
    }
 
 private static void updateContact() {
 	
 }
 
 private static void deleteContact() {
 	
 }
 
}

