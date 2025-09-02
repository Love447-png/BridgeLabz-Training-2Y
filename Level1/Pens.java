public class Pens {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int rem = pens % students;
        System.out.println("Each student gets " + perStudent + ", Remaining pens = " + rem);
    
    }
}
