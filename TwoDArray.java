import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static int[][] arrayinput(){
    Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        return arr;
    }
    public static void print2DArray(int[][] arr){

        int rows = arr.length;
        for(int i=0; i < rows; i++){
            // how to print the ith row
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // //hard coded array
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};
        // System.out.println(arr);
        // System.out.println(Arrays.toString(arr[0]));
        // System.out.println(Arrays.toString(arr[1]));
        

        // //loop to iterate array
        
       
                                                                                        
        int[][] arr = arrayinput();
        print2DArray(arr);

     }
}
