public class Ejercicio 7 {

    import java.util.*;
import java.io.*;

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
        for(int j=0; j<n ;j++){
            int result = a += Math.pow(2, j) *b;
            
            System.out.print(result + " ");
        }
        
        System.out.println();
        
        }
       
        in.close();
    }
}

