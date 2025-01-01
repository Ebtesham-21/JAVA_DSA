import java.util.*;
public class Algorithoms {

     public static int binarySearch(int numbers[], int key){
          int start = 0; int end= numbers.length-1;
          while(start <= end){
               int mid = (start + end)/2;

               if(numbers[mid] == key){
                    return mid;
               }
               else if(numbers[mid] < key){
                    start = mid + 1;
               } else {
                    end = mid - 1;
               }
          }
     return -1;
     }

     // swap array reverse

     public static void reverse(int numbers[]){
          int start = 0; int end = numbers.length-1;
          while(start < end){
               int temp = numbers[end];
               numbers[end] = numbers[start];
               numbers[start] = temp;
               start++;
               end--;

          }
     }

     public static void main(String args[]){
          int numbers[] = {1, 2, 4, 5, 6, 8, 9};
          int key = 9;

          // System.out.println("Element found at index: " + binarySearch(numbers, key));
          reverse(numbers);
          System.out.println(Arrays.toString(numbers));



     }

     

    }
    

