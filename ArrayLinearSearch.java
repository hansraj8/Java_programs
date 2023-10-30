import java.util.Arrays;
import java.util.Scanner;

public class ArrayLinearSearch {
    
    //Approach 1 without function
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int j = sc.nextInt();
//         int n = sc.nextInt();
//         int[] count = new int[j];
//         int arr[] = {5,6,7,2,7,3,7,4};
//             int indexCount = 0;
//         for(int i = 0;i< arr.length;i++){
//             if(arr[i]==n){
//                 count[indexCount] = i;
//                     indexCount++;
//             }
//         }
//         System.out.print("Indices of occurrences of " + n + ": ");
//         for (int k = 0; k < indexCount; k++) {
//             System.out.print(count[k] + " ");
//         }
// }
// }

public static int[] searchAll(int[] arr, int element){
    int cnt =0;
    for(int x:arr){
        if(x == element){

            cnt++;
        }
    }
    //create array of size == cnt
    int[] output = new int[cnt];
    int j =0;
    for(int i =0;i<arr.length; i++){
        if(arr[i]==element){
            output[j] = i;
            j++;
        }
    }
   

    return output;


}
public static int[] searchAll2(int []arr,int element){
    int n = arr.length;
    int[] output = new int[n+1];
    int j =0;
    for(int i =0;i<n;i++){
        if(arr[i]==element){
            output[j] = i;
            j++;

        }
    }
    output[j] = -1;
    return output;
}

public static void main(String[] args) {
    int arr[] = {5,6,7,2,7,3,7,4};
    int[] output = searchAll(arr, 7);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(output));

    output = searchAll2(arr, 7);
    for(int j =0;output[j]!=-1;j++){
        System.out.print(output[j]+",");
    }
}

}
