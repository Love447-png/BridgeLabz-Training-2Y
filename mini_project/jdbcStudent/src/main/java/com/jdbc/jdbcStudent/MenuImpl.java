package com.jdbc.jdbcStudent;
import java.util.Scanner;
import java.util.Scanner;
public class MenuImpl implements IMenu {
	
   private Scanner  sc= new Scanner(System.in);
   private IStudent student =new StudentImpl();
   
   @Override
   public void displayMenu()
   {
	   while(true)
	   {
		   System.out.println("\n-----------------StudentManagement-----------------------\n");
		   System.out.println("1.Create Student Table");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("2.Insert Student");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("3.Update Student");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("4.Delete Student");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("5.Insert Multiple Students");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("6.Update Multiple Students");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("7.Delete Multiple Students");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("8.Show Students");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("9.Show Student By Id");
		   System.out.println("-------------------------------------------------------------");
		   System.out.println("10.Exit");
		   System.out.println("-------------------------------------------------------------");
		   int choice=sc.nextInt();
		   switch (choice)
		   {
		   case 1:
			   student.createTableStudent();
			   break;
		   
		   case 2:
			   student.insertStudent();
			   break;
		   case 3:
			   student.updateStudent();
			   break;
		   case 4:
			   student.deleteStudent();
			   break;
		   case 5:
			   student.insertMultipleStudent();
			   break;
		   case 6:
			   student.updateMutipleStudent();
			   break;
		   case 7:
			   student.deleteMultipleStudent();
			   break;
		   case 8:
			   student.viewStudent();
			   break;
		   case 9:
			   student.viewStudentById();
			   break;
		   case 10:
			   System.out.println("Thank You ....");
		   default :
			   System.out.println("Invalid Choice Please Try again");
		   }
		   
			   
	   }
   }
   
   
}
