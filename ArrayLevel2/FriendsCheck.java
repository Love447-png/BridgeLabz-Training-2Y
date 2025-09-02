import java.util.*;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = {"Amar", "Akbar", "Anthony"};
        int ages[] = new int[3];
        int heights[] = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextInt();
        }
        int minAge = ages[0], minIndex = 0;
        int maxHeight = heights[0], maxIndex = 0;
        for(int i=1;i<3;i++){
            if(ages[i] < minAge){
                minAge = ages[i];
                minIndex = i;
            }
            if(heights[i] > maxHeight){
                maxHeight = heights[i];
                maxIndex = i;
            }
        }
        System.out.println("Youngest is " + names[minIndex]);
        System.out.println("Tallest is " + names[maxIndex]);
    }
}
