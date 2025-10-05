import java.util.Arrays;
import java.util.Scanner;
public class array3 {

   public static void main(String[] args) {
       char vowels[]={'e','u','a','o','i'};
       int startingIndex=1;
       int endingIndex=4;
       Arrays.sort(vowels, startingIndex, endingIndex);
       System.out.println(Arrays.toString(vowels));
          }               
}
