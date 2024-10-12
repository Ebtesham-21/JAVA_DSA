import java.util.*;
public class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input products");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        double gst = total * .18;
        double bill = gst + total;
        System.out.println("your bill = " + bill);
        sc.close();


    }
}
