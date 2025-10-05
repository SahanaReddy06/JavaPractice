import java.util.Scanner;
public class ifelse {
public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);

System.out.println("Enter first number");
double n1=scanner.nextDouble();

System.out.println("Enter second  number");
double n2=scanner.nextDouble();

scanner.nextLine();

System.out.println("enter operation?");
String operation = scanner.nextLine();  

if (operation.equals("sum")) {
System.out.printf("%f+%f=%f", n1,n2,n1+n2);
}else{
System.out.printf("%s is not supported", operation);                       
}
scanner.close();
}
                      
}
