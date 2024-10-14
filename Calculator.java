import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int ab = sc.nextInt();
        System.out.println("Enter b");
        int bc = sc.nextInt();
        System.out.println("Enter + / - / * / /");
        char o = sc.next().charAt(0) ;

        switch(o){
            case '+' : System.out.println(ab + bc);
            break;
            case '-' : System.out.println(ab - bc);
            break;
            case '*' : System.out.println(ab * bc);
            break;
            case '/' : System.out.println(ab / bc);
            break;
            default: System.out.println("wrong operator");

        }



    }
    
}
