import java.util.HashMap;

public class HashMapTest{
  public static void main(String[] args){
    HashMap<String, Integer> ages = new HashMap<String, Integer>();

    ages.put("John", 32);
    ages.put("Mark", 12);
    ages.put("Turing", 45);
    ages.put("Grace", 50);

    System.out.println(String.format("All data --> %s", ages));
    System.out.println(String.format("Mark's age --> %d", ages.get("Mark")));
  }
}

