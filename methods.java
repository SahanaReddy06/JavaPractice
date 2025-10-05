public class methods {
   public static void main(String[] args) {
   methods m = new methods();
   m.sayHello();
   m.addNumbers(2,5);
   m.addNumbers(20,30);
   int k = m.multiplyNum(2,3);
   System.out.println(k); 
}

  
   void sayHello() {
       System.out.println("Hello sahana");     
   }  
   void addNumbers(int a, int b) {
       System.out.println(a+b);
   } 
   int multiplyNum(int a, int b) {
        int x=a*b;
        return x;                    
   }                
}
