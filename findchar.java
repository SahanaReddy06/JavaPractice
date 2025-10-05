import java.util.Scanner;
public class findchar {
     public static void main(String[] args) {
     char ch;
     System.out.println("Enter a character");
     Scanner input=new Scanner(System.in);
     ch=input.next().charAt(0);
     if (ch>='A' && ch<='Z'){
        System.out.println(1);
     }
     else if(ch>='a' && ch <='z') {
        System.out.println(0);
     }
     else {
        System.out.println(-1);
         }
      

    
}                    
}
