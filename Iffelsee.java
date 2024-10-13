import java.util.*;
public class Iffelsee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input age");
        int age = sc.nextInt();
        if(age >= 19){
            System.out.println("Can drive");
        }
        else if (age >= 20){
            System.out.println("Can vote");
        }
        else {
            System.out.println("Not eligable");
        }

    }
}
