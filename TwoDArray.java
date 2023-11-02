import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        //hard coded array
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        

        //loop to iterate array
        for(int i=0;i<arr.length;i++){
            // go through the ith row
          //  System.out.println(Arrays.toString(arr[i]));
            for(int j =0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
     }
}
