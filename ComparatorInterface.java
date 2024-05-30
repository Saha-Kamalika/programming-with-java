import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class ComparatorInterface{
  public static void main(String[] args){
    List<Integer> list=new ArrayList<>();
    list.add(110);
    list.add(101);
    list.add(132);
    list.add(163);
    //sorting the numbers based on last 2 digits 
    Comparator<Integer> com=new Comparator<Integer>(){
      public int compare(Integer o1,Integer o2){
        if(o1%100>o2%100) return 1;
        return -1;
      }
    };
    Collections.sort(list,com);
    for(int ele:list) System.out.print(ele+" ");
  }
}