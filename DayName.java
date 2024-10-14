import java.util.*;
public class DayName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day");
        int day = sc.nextInt();
        switch (day) {
            case 1:  System.out.println("Friday");
            break;
            case 2:  System.out.println("Saturday");
            break;
            case 3:  System.out.println("Sunday");
            break;
            case 4:  System.out.println("Monday");
            break;
            case 5:  System.out.println("Twesday");
            break;
            case 6:  System.out.println("Wednesday");
            break;
            case 7:  System.out.println("Thursday");
            break;
            default: System.out.println("Saik that's the wrong number");

                
              
        }


}
}