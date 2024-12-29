import java.util.*;
public class ArrayInOut {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return  largest;
    }
    public static void main(String args[]){
        int marks[] = new int[100];
        int numbers[] = {1, 2, 3, 5, 8};
        System.out.println("largest is : " + getLargest(numbers));
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
    }
    
}
