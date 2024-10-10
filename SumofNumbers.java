import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int val = 1;
        int sum = 0;

        while (val <= n){
            sum += val;
            val++;
        }

        System.out.println("Sum of numbers from 1 to" + " " + n +" is " + sum);
        scanner.close();
    }
    
}
