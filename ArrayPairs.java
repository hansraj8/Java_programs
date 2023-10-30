import java.util.Arrays;

public class ArrayPairs {
    public static void main(String[] args) {
        //ps to find the pair with whom adding sum will be 15
        // [1,3,8,3,11,12,13]
        //this one is approch one
        
        int arr[] = {2,8,5,10,13,11,15,7};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // pair sum
        int i =0;
        int j = arr.length -1;
        int sum= 15;
        while(i<j){
            if(arr[i]+arr[j]>sum){
                j--;
            }
            else if(arr[i]+arr[j] == sum){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;

            }
            else{
                i++;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
