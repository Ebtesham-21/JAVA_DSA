
import java.util.Scanner;

public class ProductFunc {
    public static int product(int a, int b){
        int pro = a * b;
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("product = " + product(a, b));
        sc.close();
        
    }
}
