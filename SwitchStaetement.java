public class SwitchStaetement {
    public static void main(String args[]){
         String ab = "bc";

         switch(ab){
            case "abc" : System.out.println("ok");
            break;
            case "bc" : System.out.println("not ok");
            break;
            case "ac" : System.out.println("ok ac");
            break;
            default: System.out.println("def");

         }
    }
}
