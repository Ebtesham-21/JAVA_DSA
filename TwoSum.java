import java.util.Scanner;
public class TwoSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first int number");
        int A = scanner.nextInt();
        System.out.println("Input second int number");
        int B = scanner.nextInt();

        int sum = A + B;
        System.out.println("Total ");
        System.out.println(sum);
        scanner.close();

    }
    
}