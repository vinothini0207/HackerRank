package HackerRank.String;

import java.io.*;
import java.util.*;
public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String revStr="";
        for(int i=A.length()-1;i>=0;i--){
          revStr=revStr+A.charAt(i);
        }
        if(A.equals(revStr)){
          System.out.println("Yes");
        }
        else{
          System.out.println("No");
        }
    }
}



