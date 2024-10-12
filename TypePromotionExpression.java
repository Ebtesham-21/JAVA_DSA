public class TypePromotionExpression {
    public static void main(String args[]){
        // converted to largest data type presented
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        // int ans = a + b + c + d;
        // error dibe cause sob gula kye double e convert korse
        // eta thik hobye nicher ta
        double ans = a + b + c + d;
        System.out.println(ans);
    }

}
