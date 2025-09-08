class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s){
        name=n;
        id=i;
        salary=s;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args){
        Employee e1=new Employee("Ravi",101,50000);
        Employee e2=new Employee("Anita",102,60000);

        e1.display();
        e2.display();
    }
}
