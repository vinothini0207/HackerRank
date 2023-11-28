package HackerRank.String;
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length()+B.length();
        System.out.println(len);
        String str="";
        int l=A.length()>B.length()?B.length():A.length();
        for(int i=0;i<l;i++){
        if((int)A.toLowerCase().charAt(i)>(int)B.toLowerCase().charAt(i)){
         str="Yes";
         break;
           }else if((int)B.toLowerCase().charAt(i)>(int)A.toLowerCase().charAt(i)){
            str="No";
        break;
           }
        }
        if(str==""){
          if(A.length()>B.length()){
          str="Yes";
          }
          else{
            str="No";
          }
        }
        System.out.println(str);
         System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}




