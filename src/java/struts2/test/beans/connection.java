/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import struts2.test.core.ConnectionManager;

/**
 *
 * @author deepd
 */
public class connection {
    public static void main(String[] args) throws ClassNotFoundException {
  // TODO Auto-generated method stub
  //Select Query to get the Data from employee_details table
  String QUERY = "select * from employee_details where empNum = 2001";
  String QUERY1 = "select * from employee_details where empNum = 2002";
  Boolean autoCommit;
  String update_query = "update employee_details set salary = 41000 where empNum = 2001"; 
  String update_query1 = "update employee_details set salary = 42000 where empNum = 2002"; 
  Connection conn=null;
  
  //Update query to set the email id for the employee whose empNUM is 1001
  //Class.forName("oracle.jdbc.driver.OracleDriver");  
  try
  {
    conn=ConnectionManager.getConnection();
    Statement statemnt1 = conn.createStatement();
    ResultSet rs1 =null;
    //Checking whether the SELECT query is executed successfully or not
    rs1 = statemnt1.executeQuery(QUERY); 
   
    //Executed the SELECT Query
    System.out.println("Getting the data from employee_details table");
    displayData(rs1);
    //Set the autoCommit value of the connection to FALSE
    System.out.println("Setting the AutoCommit value as FALSE");
    conn.setAutoCommit(false);
    autoCommit = conn.getAutoCommit();
    System.out.println("AutoCommit value of the Connection = "+ autoCommit);
    //Creating Statement to execute the update query
    statemnt1 = conn.createStatement();
    System.out.println("Executing Update query to update salary of EMPNUM = 2001");
    System.out.println("Update Query is " + update_query);
    int return_rows = statemnt1.executeUpdate(update_query);
    System.out.println("Updated the data but didn't commit");
    //Getting data after Updation 
    Connection conn1 = ConnectionManager.getConnection();
    System.out.println("Opening new connection");
    System.out.println("EMPNUM = 2001 data");
    Statement statement2 = conn1.createStatement();
    ResultSet rs;
    rs = statement2.executeQuery(QUERY); 
    displayData(rs);
    System.out.println("Commit has been done");
    conn.commit();
    Savepoint s1 = conn.setSavepoint();
    System.out.println("SavePoint has been created");
    System.out.println("Displaying data of EMPNUM = 2001");
    System.out.println("Using The Second Connection");
    rs = statement2.executeQuery(QUERY); 
    displayData(rs);
    rs = statemnt1.executeQuery(QUERY); 
    //Rollback the transaction
    System.out.println("Data of EMPNUM = 2002");
    rs1 = statemnt1.executeQuery(QUERY1); 
    displayData(rs1); 
    System.out.println("Updating the salary of EMPNUM = 2002");
    System.out.println("Update Query is " + update_query1);
    statemnt1.executeUpdate(update_query1);
    System.out.println("Data of EMPNUM = 2002 but didn't commit");
    rs1 = statemnt1.executeQuery(QUERY1); 
    displayData(rs1);
    System.out.println("Rollback is done... so updated data won't be reflected");
    
    conn.rollback(s1);
    System.out.println("Data of EMPNUM = 2002 after Rollback till the last savepoint");
    rs1 = statemnt1.executeQuery(QUERY1); 
    displayData(rs1);
     
  }
  catch (SQLException e) {
   e.printStackTrace();
  }
 }
  public static void displayData(ResultSet rs1) throws SQLException
  {

   while(rs1.next())
   {
    int empNum = rs1.getInt("empNum");
    String empName = rs1.getString("empName");
    //String firstName = rs1.getString("firstName");
    //String email = rs1.getString("email");
    //String deptNum = rs1.getString("deptNum");
    int salary = rs1.getInt("salary");
    System.out.println(empNum + "," +empName+ "," +salary);
   }
  }
}
