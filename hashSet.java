package classFiles;
import java.util.HashSet;
public class hashSet {
    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>(10,0.5f);
        hs.add(1);
        hs.add(9);
        hs.add(4);
        hs.add(7);
        hs.add(1);
        for(Integer i:hs)
            System.out.print(i+" ");
        System.out.println();
        hs.clear();
        System.out.print(hs);
    }
}
//other methods: clear(),equals,removeAll(),addAll()...