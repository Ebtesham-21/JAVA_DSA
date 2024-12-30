public class Switchcase {
    public static void main(String args[]){
        String dayOfWeek = "sunday";
        switch (dayOfWeek){
            case "friday":
                System.out.println(1);
                break;
            case "saturday":
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }
    }
}
