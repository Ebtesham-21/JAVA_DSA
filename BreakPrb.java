import java.util.*;
public class BreakPrb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // my attempt (wrong code)
    //     int n = sc.nextInt();
    //     for (int i = 1; i<= n; i++){
    //         if(i % 10 == 0){
    //             break;
    //         }
    //     System.out.println(i);
    //     }
    // do { 
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         break;
    //     }
    //     System.out.println(n);
    // } while (true);
    while(true){
        int n = sc.nextInt();
        if(n % 10 == 0){
            break;
        }
        System.out.println(n);
    }
    sc.close(); 
    }
}
