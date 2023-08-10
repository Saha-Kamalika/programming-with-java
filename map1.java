import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
public class map1{
  public static void main(String[] args){
    Map<String, String> map=new LinkedHashMap<>();
    map.put("myself", "kamalika");
    map.put("father", "kamal");
    map.put("mother","alo");
    map.put("partner","bishtu");

    Set<String> keys=map.keySet();
    for(String k:keys){
      System.out.println(k+": "+map.get(k));
    }
    Set<Map.Entry<String,String>> values=map.entrySet();
    for(Map.Entry<String,String> e: values){
        System.out.println(e.getKey()+" : "+e.getValue());
    }
    System.out.println();
    
  }
}