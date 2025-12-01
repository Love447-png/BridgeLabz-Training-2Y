package com.jdbc.jdbcStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentImpl implements IStudent {

    private Connection con;
    private Scanner sc = new Scanner(System.in);

    public StudentImpl() {
        con = new ConnectionImpl().getConnection();
    }

    @Override
    public void createTableStudent() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS student ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "age INT)";
            
            Statement stmt = con.createStatement();  
            stmt.executeUpdate(query);

            System.out.println("Student Table  is created.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void insertStudent() {   
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String query = "INSERT INTO student VALUES(" + id + ", '" + name + "', " + age + ")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Student inserted.");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void updateStudent() { 
        try {
            System.out.print("Enter ID of student to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new Name: ");
            String name = sc.next();
            System.out.print("Enter new Age: ");
            int age = sc.nextInt();

            String query = "UPDATE student SET name='" + name + "', age=" + age + " WHERE id=" + id;
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);

            if (rows > 0)
                {
            	System.out.println(" Student updated.");
            	}
            else
                {
            	System.out.println(" No student found with this ID.");
                }

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteStudent() {  
        try {
            System.out.print("Enter ID of student to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM student WHERE id=" + id;
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(query);

            if (rows > 0)
                
            	{
            	System.out.println(" Student deleted.");
                }
            else {
            	  System.out.println("No student found with this ID.");
            }
              

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    @Override
    public void insertMultipleStudent() {
        try {    
            System.out.print("How many students : ");
            int count = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");

            for(int i = 0; i < count; i++) {
                System.out.println("\n--- Student " + (i+1) + " ---");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,age);
                ps.executeUpdate();
            }
            System.out.println(" Multiple students inserted.");

        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void updateMutipleStudent() {
        try {
            System.out.print("How many students to update: ");
            int count = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("UPDATE student SET name=?, age=? WHERE id=?");

            for(int i = 0; i < count; i++) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("New Name: ");
                String name = sc.next();
                System.out.print("New Age: ");
                int age = sc.nextInt();

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setInt(3, id);

                int rows = ps.executeUpdate();
                if (rows > 0) {
                	System.out.println("Recored Updated.");
                }
                else 
                	{
                	System.out.println(" ID Not Found.");
                	}
            }

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteMultipleStudent() {
        try {
            System.out.print("How many students to delete: ");
            int count = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?");

            for(int i = 0; i < count; i++) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                ps.setInt(1,id);

                int rows = ps.executeUpdate();
                if (rows > 0) 
                	{System.out.println(" Deleted.");
                	
                	}
                else 
                	{
                	System.out.println("ID Not Found.");
                	}
            }

        } 
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void viewStudent() {
    	try {
    		String query=("SELECT* FROM  student");
    	Statement stmt =con.createStatement();
    	ResultSet rs=stmt.executeQuery(query);
    	boolean found=false;
    	while(rs.next())
    	{ 
    		found =true;
    		System.out.println(rs.getInt("id")+","+rs.getString("name")+","+rs.getInt("age"));

    	}
    	if(!found)
    	{
    		System.out.println("Student Record Found");
    	}
    	
    }
    	catch (Exception e)
    	{
    		 System.out.println("Error: " + e.getMessage());	
    	}
    	
   }
  @Override
  public void viewStudentById() {
	  try {
		  System.out.print("Enter View  Student  By:");
	        int id = sc.nextInt();

	        String query = "SELECT * FROM student WHERE id = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setInt(1, id);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next())
	        {
	        	System.out.println("ID:" + rs.getInt("id")+","+"Name:" + rs.getString("name") +","+ "Age:"+ rs.getInt("age"));
	        }
	        else {
	        	System.out.println("Student Record Not found ");
	        }

	        
	  }
	  catch(Exception e){
		  System.out.println("Error: " + e.getMessage());	
	  }
  }
}
