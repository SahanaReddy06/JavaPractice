import java.util.Arrays;
import java.util.Scanner;
public class array6 {
public static void main(String[] args) {
int numbers[]={1,2,3,4,5}; 
int copyNumbers[]=Arrays.copyOf(numbers, numbers.length);
//Arrays.fill(numbers,0);
System.out.println(Arrays.toString(numbers));
System.out.println(Arrays.toString(copyNumbers));      
System.out.println(numbers==copyNumbers);    
System.out.println(Arrays.equals(numbers, copyNumbers));  
}
}
