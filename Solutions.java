
import java.util.Scanner;
public class Solutions {
    
    public static void main(String[] args) {

      /* Exercise 1 
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        
        Exercise 2
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        Exercise 3 If Else

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if(N % 2 !=0){
            System.out.println("Weird");
        }  else if(N % 2 ==0 && N > 2 && N <=5) {
            System.out.println("Not Weird");
        } else if(N % 2 ==0 && N>= 6 && N <=20){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }*/

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}

