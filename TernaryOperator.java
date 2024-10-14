import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        int marks = sc.nextInt();
        String result = (marks >=33) ? "pass" : "fail";
        System.out.println(result);
    }
}
