public class PrimeFunc {
    public static boolean prime(int n) {
        // corner case
        if(n == 2){
            return true;
        }
        // main work
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0){
                return false;
            }
           
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(prime(7));
    }
}
