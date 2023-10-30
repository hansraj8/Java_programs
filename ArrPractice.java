import java.util.Scanner;

public class ArrPractice {

    public static int largestEle(int arr[], int arrays){
        
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //wap to print the largest element in the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] arrays = new int[nums];

        for(int i =0; i<arrays.length; i++){
            arrays[i] = sc.nextInt();
        }
        
        System.out.println(largestEle(arrays, nums));

    }
}
