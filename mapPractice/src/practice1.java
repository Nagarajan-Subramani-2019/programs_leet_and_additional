import java.util.HashMap;
import java.util.Map;

public class practice1 {
    public static void main(String[] args) {
        Map<String,Integer> mapObject=Map.of("Alice",30,
                                             "Bob",29); //Non Mutable Map

        var mapOf=Map.of("Alice",30,
                "Bob",29); //Non Mutable Map

        Map<String,Integer> mapObj1=new HashMap<String,Integer>();
        mapObj1.put("Claude", 42);
        mapObj1.put("Alice",30);
        mapObj1.put("Bob",29);

        System.out.println(mapObj1);
        System.out.println(mapObj1.size());

        System.out.println(mapOf);
        System.out.println(mapOf.size());



    }
}
