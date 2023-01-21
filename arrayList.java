package arrayList;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        ArrayList<Integer>al1=new ArrayList<>();
        al1.add(40);
        al1.add(50);
        System.out.println(al.remove(2));
        System.out.println(al.contains(30));
        System.out.println(al1.containsAll(al));
        System.out.println(al.addAll(al1));
        System.out.println(al.size());
        for(Integer el:al)
            System.out.println(el); //ordered
        Set<Integer>s=new HashSet<>();
        s.addAll(al);
        System.out.println(s); //not ordered
    }
}
