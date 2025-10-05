import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
public static void main(String[] args) {
     ArrayList<Integer> numbers= new ArrayList<Integer>();                   
     numbers.add(1);
     numbers.add(2);
     System.out.println(numbers.toString());
     System.out.println(numbers.get(1));
     System.out.println(numbers.remove(1));
     System.out.println(numbers.set(0, Integer.valueOf(3)));
     }                    
}
