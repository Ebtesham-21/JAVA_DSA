import java.util.*;
public class LargetnumCondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add NUM1");
        int num1 = sc.nextInt();
        System.out.println("Add NUM2");
        int num2 = sc.nextInt();
        System.out.println("Add NUM3");
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.println("NUM1 Bigger");
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("NUM2 Bigger");
        }
        else {
            System.out.println("NUM3 Bigger");
        }
        sc.close();
    }
    
}
