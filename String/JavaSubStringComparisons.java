package HackerRank.String;
import java.util.Scanner;
public class JavaSubStringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++){
            String subStr=s.substring(i, k+i);
            smallest=smallest.compareTo(subStr)<0?smallest:subStr;
            largest=largest.compareTo(subStr)>0?largest:subStr;
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

