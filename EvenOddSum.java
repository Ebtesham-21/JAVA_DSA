import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i <= num; i++){
            System.out.println("enter numbers");
          int  n = sc.nextInt();
            if(n % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

        }
        System.out.println("even= " + evenSum);
        System.out.println("odd= " + oddSum);
        sc.close();
    }
    
}
