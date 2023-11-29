package HackerRank.String;
import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        System.out.println(s);
        // Write your code here.
        String[] strArray=s.split("[^A-Za-z0-9]+");
        System.out.println(strArray.toString());
        int num=strArray.length;
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            System.out.println(num);
            for(int i=0;i<num;i++){
                System.out.println(strArray[i]);
            }
        }
        scan.close();
    }
}

