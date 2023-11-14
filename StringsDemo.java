import java.util.Scanner;

public class StringsDemo {
    public static void basic(){
         String C = new String();

         C = "hello";
       System.out.println(C.charAt(2));

        System.out.println(C);

        Scanner sc = new Scanner(System.in);
        String Fname = sc.next();
        String Lname = sc.next();
        System.out.println(Fname);
        System.out.println(Lname);
        String Line = sc.nextLine();
        System.out.println(Line.stripLeading());
    }
    public static void main(String[] args) {
       
// read n strings and find out the largest of the string

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int largestlen = 0;
    String largeString = "";
    for(int i=1;i<=n;i++){
        String line = sc.nextLine();
        if(line.length() > largestlen){
            largeString = line;
            largestlen = line.length();

        }

    }
    System.out.println("largest string "+largeString);
    System.out.println("largest length of the string" + largestlen);


    }
}
 