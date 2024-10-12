import java.util.Scanner;
public class Square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side of the square");
        int A = sc.nextInt();

        
        System.out.println("Square: " + (A * A));
        sc.close();
    }
}
