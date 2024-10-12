import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first int number");
        int A = sc.nextInt();
        System.out.println("Input second int number");
        int B = sc.nextInt();
        System.out.println("Input third int number");
        int C = sc.nextInt();

        int average = (A + B + C)/3;

        System.out.println("averge = 40" + average);
        sc.close();

    }
    
}
