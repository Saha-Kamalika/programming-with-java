package classFiles;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer>al=new ArrayList();
        ArrayList<Integer>al2=new ArrayList(5);
        al.add(10);
        al.add(15);
        al.add(30);
        al2.add(1);
        al2.add(5);
        al.addAll(0,al2);// adds al2 at the beginning of al
        al.addAll(al2);// adds al2 at the end of al
        System.out.println(al.get(2));
        al.set(4,55);
        for(Integer i: al)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(al.contains(155));
    }
}
/* int add(index,object)
    boolean add(object)
    boolean remove(object)
    boolean addAll(Collection)
    boolean contains(Object)
    boolean retainsAll(Collection)
    void set(index,Object)
    int get(index)
*/
