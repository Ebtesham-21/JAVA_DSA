import  java.util.*;
public class BinomealFunc {
    public static int fac(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int bionmeal (int n, int r){
        int fact_n = fac(n);
        int fact_r = fac(r);
        int n_r = fac(n - r);
        int wholl_fact = fact_n / (fact_r * n_r) ;
        
        return wholl_fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("binomeal " + bionmeal(n, r));
        
        sc.close(); 
    }
}
