import java.util.Arrays;
import java.util.Scanner;
public class array4 {

   public static void main(String[] args) {
       char vowels[]={'e','u','a','o','i'};
       char key='o';
       int foundItemIndex=Arrays.binarySearch(vowels, key);
       
       System.out.println(foundItemIndex);
          }               
}

