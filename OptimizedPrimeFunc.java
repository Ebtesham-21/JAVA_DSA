public class OptimizedPrimeFunc {
    public static boolean prime(int n) {
        // corner case
        if(n == 2){
            return true;
        }
        // main work
        for(int i = 2; i<=Math.sqrt(n); i++){
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


