import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("inter your income in lakhs");
        int income = sc.nextInt();
        int tax;

        if( income < 500000){
            tax = 0;
        System.out.println("Your tax = 0");
        }

        else if(income >= 500000 && income <= 1000000 ){
            tax = (int) (income * .20);
            System.out.println("Your tax = " + tax);
        }

        else {
            tax =(int) (income * .30);
            System.out.println("Your tax = " + tax);
        }


    }
}
