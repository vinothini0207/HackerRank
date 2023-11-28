package HackerRank.String;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag=false;
        if(a.length()==b.length()){
          String a1=a.toLowerCase();
          String b1=b.toLowerCase();
       char[] str=a1.toCharArray();
       char[] str2=b1.toCharArray();
       java.util.Arrays.sort(str);
      java.util.Arrays.sort(str2);
       for(int i=0;i<str.length-1;i++){
         if(str[i]==str2[i]){
           flag=true;
         }
         else{
            flag=false;
            break;
         }
       }
        }
        return flag;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
