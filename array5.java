import java.util.Arrays;
import java.util.Scanner;
public class array5 {

   public static void main(String[] args) {
       char vowels[]={'e','u','a','o','i'};

       int startingIndex=1;
       int endingIndex=4;
       Arrays.fill(vowels, startingIndex, endingIndex, 'x');

       System.out.println(vowels);
          }               
}

