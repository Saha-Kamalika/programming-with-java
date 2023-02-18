package classFiles;
import java.util.LinkedList;
public class reverseUsingCollections {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll1){
        LinkedList<Integer> ll2=new LinkedList<>();
        int i;
        for(i=ll1.size()-1;i>=0;i--)
            ll2.add(ll1.get(i));
        return ll2;
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        System.out.println("Before reversal: "+ll1);
        System.out.println("After reversal: "+reverseLinkedList(ll1));
    }
}
