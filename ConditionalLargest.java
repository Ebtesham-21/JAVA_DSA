import java.util.*;
public class ConditionalLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num 2");
        int num2 = sc.nextInt();

        if(num1 > num2){
        System.out.println("num1 big");

        }
        else {
            System.out.println("num2 big");
        }

    }
}
