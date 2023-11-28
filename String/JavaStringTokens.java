package HackerRank.String;
 import java.io.*;
import java.util.*;
    
public class JavaStringTokens {
           public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine().trim();
            int num=0;
            String[] words=s.split("[^A-Za-z0-9]+");
            num=words.length;
           if(s.length()==0){
              System.out.println(0);
            }
            else{
              System.out.println(num);
              for(int i=0;i<num;i++){
                System.out.println(words[i]);
              }
            }
            // Write your code here.
            scan.close();
            
            
          
        }
    }
    
      

