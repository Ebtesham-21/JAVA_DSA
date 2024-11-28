public class AverageMethod {
    public static int average(int a, int b, int c){
        int ave = (a + b + c)/2;
        return ave;
    }

    public static void main(String[] args) {
        System.out.println("average " + average(10, 20, 30));
    }
}
