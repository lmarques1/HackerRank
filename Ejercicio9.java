import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio9 {

    
    private static int B;
    private static int H;
    private static boolean flag;
    
static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
     scanner.close();
     
     if(B <=0 || H <=0) {
         
         System.out.println("java.lang.Exception: Breadth and height must be positive");
     }
     else{
         flag = true;
     }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class