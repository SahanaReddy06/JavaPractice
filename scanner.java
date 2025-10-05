import java.util.Scanner;
public abstract class scanner {
public static void main(String[] args) {
System.out.println("Enter your name");
Scanner scanner=new Scanner(System.in);
String name=scanner.nextLine();
System.out.printf("my name is   "  + name);
scanner.close();
}
                         
}
