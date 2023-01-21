package arrayList;
import java.util.ArrayList;
import java.util.List;
public class listInJava {
    public static void main(String[] args){
        List<Integer>l=new ArrayList<>();
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.add(0,10);
        System.out.println(l);
        l.set(1,15);
        System.out.println(l);
        System.out.println(l.indexOf(15));
    }
}
