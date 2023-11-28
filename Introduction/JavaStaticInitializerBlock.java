import java.io.*;
import java.util.*;
public class JavaStaticInitializerBlock {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int B=sc.nextInt();
        int H=sc.nextInt();
        if(B>0 && H>0){
          int result=B*H;
          System.out.println(result);
        }
        else{
          System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

