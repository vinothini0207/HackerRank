import java.util.Scanner;
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        
        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            generateSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    public static void generateSeries(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
