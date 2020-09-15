package test;

import java.sql.*;

public class Main {
	
	public static final String DB_NAME = "kontakte.de";
	// Falls DB noch nicht exisitiert, wird sie dort erstellt
	public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Repositories\\DatabaseCourse\\DatabaseTest\\src\\test\\" + DB_NAME;
	
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

			statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_KONTAKT + "( " + COLUMN_NAME + " TEXT, "
			                    + COLUMN_PHONE + " INTEGER, " + COLUMN_EMAIL + " TEXT)"); // In Konsole noch ein Semicolon nach schließender SQL-Klamme

			// C - Create
			createContact(statement, "Christian", 123456, "Christian@gmail.com");
			createContact(statement, "Chris", 152123456, "Chris@web.de");

			// R - Read
			readContact(statement);

			// U - Update
			updateContact(statement, "christian", "Hans-Uwe");

			// D - Delete
			deleteContact(statement, "hans-Uwe");

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
/*
	private static void createContact(Statement statement, String name, int phone, String email) throws SQLException  {
		statement.execute("INSERT INTO " + TABLE_KONTAKT + " VALUES " + "('" + name + "'," + phone + ",'" + email + "')");
	}

 */

// VORSICHT: single quotes needed.
    private static void createContact(Statement statement, String name, int phone, String email) throws SQLException {
		statement.execute("INSERT INTO " + TABLE_KONTAKT + " VALUES " + "('"
				+ name + "', " + phone + ",' " + email + "')");
    }


    
 private static void readContact(Statement statement) throws SQLException {
    	ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_KONTAKT);

    	while(resultSet.next()) {
			System.out.println(resultSet.getString(COLUMN_NAME));
			System.out.println(resultSet.getInt(COLUMN_PHONE));
			System.out.println(resultSet.getString(COLUMN_EMAIL));
		}
    	
    }
 
 private static void updateContact(Statement statement, String currentName, String newName) throws SQLException {
 	statement.execute("UPDATE " + TABLE_KONTAKT
	                    + " SET " + COLUMN_NAME + " = '" + newName + "'"
			            +  "WHERE " + COLUMN_NAME + " = '" + currentName + "'" + " COLLATE NOCASE ");
 }
 
 private static void deleteContact(Statement statement, String name) throws SQLException {
 	statement.execute("DELETE FROM " + TABLE_KONTAKT + " WHERE "
	                  + COLUMN_NAME + " = '" + name + "'" + " COLLATE  NOCASE");
 }
 
}

