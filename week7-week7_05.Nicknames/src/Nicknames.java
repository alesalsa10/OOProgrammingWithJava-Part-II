
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> person = new HashMap<String, String>();
        
        person.put("matti", "mage");
        person.put("mikael", "mixu");
        person.put("arto", "arppa");
        
        System.out.println(person.get("mikael"));
        
    }

}
