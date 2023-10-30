import java.util.Scanner;

public class ArrayWithInput {

    // public static void printArray(int[] arr){
    //     for(int x :arr){
    //         System.out.print(x+ " ");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     //create array of size n
    //     int[] marks = new int[n];  //00000
    //     printArray(marks);
    //     //read all the n locations
    //     for(int i = 0; i< marks.length; i++){
         
    //         marks[i] =  sc.nextInt();;

    //     }
    //     printArray(marks);
    //     int ele = sc.nextInt();
    //     System.out.println(findElement(marks, ele));
    // }


//write A function which accepts the array and search the element is present in that or not and return the index where the element in the array

public static int findElement(int[] arr, int element){
for(int i=0; i<arr.length ;i++){
    if(arr[i]==element){
        return i;
    }
} 
// you will reach this line if you didn't reach line 19
 return -1;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] elements = new int[n];  //size of elements

    for(int i = 0; i< elements.length; i++){

        elements[i] = sc.nextInt();
    }
    int nums = sc.nextInt();
    System.out.println(findElement(elements, nums));
}
    }