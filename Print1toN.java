import java.util.*;
public class Print1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter last num");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            System.out.println(i);
            i += 2;
        }
        sc.close();
    }
    
}
