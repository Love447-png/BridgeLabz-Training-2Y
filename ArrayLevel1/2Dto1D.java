import java.util.*;

public class 2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int arr2D[][] = new int[r][c];
        System.out.println("Enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2D[i][j] = sc.nextInt();
            }
        }
        int arr1D[] = new int[r*c];
        int k = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1D[k] = arr2D[i][j];
                k++;
            }
        }
        System.out.println("1D Array:");
        for(int i=0;i<k;i++){
            System.out.print(arr1D[i] + " ");
        }
    }
}
