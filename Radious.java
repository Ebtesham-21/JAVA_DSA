import java.util.Scanner;
public class Radious {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float rad = 3.14f * (r * r);
        System.out.println(rad);
        sc.close();
    }
    
}
