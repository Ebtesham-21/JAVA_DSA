public class BreakStat {
    public static void main(String args[]){
        for(int i = 1; i<=6; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Break");
    }
}