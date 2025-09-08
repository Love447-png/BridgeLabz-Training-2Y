class Student {
    int roll;
    String name;
    int marks1, marks2, marks3;

    Student(int r,String n,int m1,int m2,int m3){
        roll=r;
        name=n;
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }

    int total(){
        return marks1+marks2+marks3;
    }

    double percent(){
        return total()/3.0;
    }

    void display(){
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks1+" "+marks2+" "+marks3);
        System.out.println("Total: "+total());
        System.out.println("Percent: "+percent());
    }
}

public class StudentMain {
    public static void main(String[] args){
        Student s1=new Student(1,"Ravi",80,70,90);
        Student s2=new Student(2,"Neha",60,75,65);

        s1.display();
        s2.display();
    }
}
