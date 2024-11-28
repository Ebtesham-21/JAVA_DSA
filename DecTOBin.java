public class DecTOBin {
    public static void decTOBin(int n){
        int myNum = n;
        int bin = 0;
        int pow = 0; 

        while(n>0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n /2 ;
        }
        System.out.println("binary " + myNum + " = " + bin);
    }

    public static void main(String[] args) {
        decTOBin(11);
    }
}
