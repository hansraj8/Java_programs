import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    // public static void main(String[] args) {

    //     //creating array list
    //     ArrayList<Integer>arrList = new ArrayList<>(5);  //or i can mention n as the total capacity
    //     arrList.add(10);
    //     arrList.add(20);
    //     arrList.add(2, 30); //insert in the middle
    //     arrList.set(1, 12);

    //     //get a particular element
    //     System.out.println(arrList.get(0));

    //     //iterate
    //     for(Integer x:arrList){
    //         System.out.print(x + ",");
    //     }

    //     //another way to iterate 
    //     for(int i = 0; i< arrList.size();i++){
    //         System.out.print(arrList.get(i)+",");
    //     }
    // }

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>(n);

            arr.add(0,8);
            arr.add(1,9);
            arr.add(2,10);
            arr.add(3,11);
            arr.add(4,12);
            arr.add(5,13);
          
            for(int i =0; i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.print(arr.get(4));

        
        }

}
