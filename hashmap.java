import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
       HashMap<String, Integer> examScore=new HashMap <String,Integer>();
       examScore.put("Math", 75);
       examScore.put("Soci", 85);
       System.out.println(examScore.toString());
       
       examScore.forEach((subject, score)-> {
          System.out.println(subject+" " + score);
       });
    }                     
}
