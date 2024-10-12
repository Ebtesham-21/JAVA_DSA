public class Unary {
    public static void main( String args[]){
        int a = 1;
        System.out.println(a++);
        // pre increment
        int b = a++;
        // post incre
        int c = ++a;

        System.out.println(b);
        System.out.println(c);
    }
    
}
