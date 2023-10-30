import java.util.Arrays;
import java.util.Scanner;

public class Arrayinsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // we know that there  will be one insertion in future 
        int [] arr = new int[n+1];

        //read the array
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        
        }
        //print
        System.out.println(Arrays.toString(arr));
   
    //insertion
        int pos = sc.nextInt();
        int Y = sc.nextInt(); //element to  be inserted

        //shifting
        for(int i=n-1;i>=pos-1;i--){
            arr[i+1] = arr[i]; //for shifting right side
        }
        //overwrite the positon of the element
        arr[pos-1] = Y;
        System.out.println(Arrays.toString(arr));

         }
}
