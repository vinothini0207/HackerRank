package HackerRank.String;
import java.util.*;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void patternChecker(String a){
        try{
            Pattern.compile(a);
            System.out.println("Valid");
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String a;
        sc.nextLine();
        while(tc-->0){
            a=sc.nextLine();
            patternChecker(a);
        }
        sc.close();
    }
}

