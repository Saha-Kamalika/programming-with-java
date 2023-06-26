package classFiles;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class HashmapCollections {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        //Name, Net Worth(in dollars)
        hm.put("Kamalika",100);
        hm.put("Srijit",140);
        hm.put("Jividha",100);
        hm.put("Kamalika",90);
        if(hm.containsKey("Kamalika"))
            System.out.println("Kamalika is present in the map");
        if(!hm.containsKey("Rumi"))
            System.out.println("Rumi is not present in the map");
        System.out.println(hm.get("Rumi"));
        //Iteration1
        for(Map.Entry<String,Integer> m: hm.entrySet()) {
            System.out.print(m.getKey() + " ");
            System.out.print(m.getValue());
            System.out.println();
        }
        hm.remove("Jividha");
        System.out.println();
        //Iteration2
        Set<String> keys=hm.keySet();
        for(String key: keys)
            System.out.println(key+" "+hm.get(key));

    }
}
