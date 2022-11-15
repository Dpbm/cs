import java.util.Map;
import java.util.HashMap;

public class MapTest{
  public static void main(String[] args){
    Map<String, Integer> ages = new HashMap<String, Integer>();

    ages.put("John", 30);
    ages.put("Mark", 18);
    ages.put("Albert", 65);
    ages.put("Alfred", 43);

    System.out.println(ages);

  }
}
