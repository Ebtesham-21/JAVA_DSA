public class InvertedHalf {
    public static void main(String args[]){
        for(int line = 4; line>=1; line--){
            for(int num = 4; num >= line; num--){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
