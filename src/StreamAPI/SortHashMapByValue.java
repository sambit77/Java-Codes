import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("a",3);
        map.put("b",5);
        map.put("c",1);
        map.put("d",2);
        map.put("e",9);

        LinkedHashMap<String,Integer> lmap = map.entrySet()
                .stream()
                .sorted((e1,e2) -> {
                    return e1.getValue() - e2.getValue();
                }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));

        for(String k: lmap.keySet())
        {
            System.out.println(k+" "+lmap.get(k));
        }




    }
}
