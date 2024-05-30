import java.util.*;
import java.lang.Comparable;
class Student implements Comparable<Student>{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int compareTo(Student st){
        if(id>st.id) return -1;
        else if(id<st.id) return 1;
        else return 0;
    }
}
public class ComparableInterface{
    public static void main(String[] args){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1, "Kamalika"));
        list.add(new Student(2, "Srijit"));

        Collections.sort(list);
        for(Student ele: list){
            System.out.println(ele.id+" "+ele.name);
        }
    }
}
//provides a single sorting seq
//has only one method compareTo()
