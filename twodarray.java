import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
public static void main(String[] args) {
int arr[][]=new int[2][3];
Scanner s=new Scanner(System.in);
for (int i=0; i<2; i++) {
     for(int j=0; j<3; j++) {
         System.out.println("Please enter the element at row ="+(i+1)+ "and column=" +(j+1));
         arr[i][j]=s.nextInt();
     }
}
for (int i=0; i<2; i++) {
    for(int j=0; j<3; j++) {
       System.out.print(arr[i][j]+ " ");                   
    }
       System.out.println(" ");
}                       
}                
}
