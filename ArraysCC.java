public class ArraysCC {

    public static void update(int score[]){
        for(int i= 0; i<score.length; i++){
            score[i] = score[i] + 9;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = {1, 2, 3};
        int score[] = {10, 20, 30};
        update(score);
        for(int i = 0; i<score.length; i++){
            System.out.print(score[i] + " ");
        }



    }
}