package org.example;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{private static String URl="jdbc:mysql://localhost:3306/practice";
    private static String password="root";
    private static String user="root";
    private static String query="Select*From persons";
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
//making-connection
      Connection con= DriverManager.getConnection(URl,user,password);
        Statement statement = con.createStatement();
      ResultSet rs=  statement.executeQuery(query);
while(rs.next()){
    int id= rs.getInt("PersonId");
    String Lname=rs.getString("LastName");
    String Fname=rs.getString("FirstName");
    String Address=rs.getString("Address");
    String City=rs.getString("City");
    System.out.println("ID: "+id+" name: "+Fname+" Last name: "+Lname+" Address: "+Address+" City: "+City);
}
rs.close();
con.close();
    }
}
