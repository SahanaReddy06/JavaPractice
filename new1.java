public class new1 {
    public static void main(String[] args) {
    int a=10;
    char c='s';
    
    String name="Sahana";
    System.out.print(a);
    System.out.println(c);
    System.out.println(name);
    System.out.println("variable is "+a);
    String name1 =new String("DEEPU");
    System.out.println(name1);

    String literalString1="abc";
    String literalString2="abc";
    System.out.println(literalString1==literalString2);

    String String1=new String ("xyz");
    String String2=new String ("xyz");
    System.out.println(String1==String2);

    String n1="sana";
    String country="Bangladesh";
    int agee=26;
    String formatedString=String.format("my name is %s. Iam from %s. Iam %d years old", n1, country, agee);
    System.out.println(formatedString);

}                                                                        
}
