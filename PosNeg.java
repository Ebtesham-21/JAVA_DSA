import java.util.*;
public class PosNeg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int a = sc.nextInt();
        if(a < 0){
            System.out.println("negetive");
        }
        else {
            System.out.println("positive");
        }
        sc.close();
    }
    
}
