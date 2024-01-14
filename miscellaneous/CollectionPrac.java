package classFiles;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int roll;
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    @Override
    public String toString() {
        return ("Student = " + this.name + " and roll = " + this.roll + "\n");
    }
    @Override
    public int compareTo(Student o) {
        return this.roll - o.roll;
    }
}
public class CollectionPrac {
    public static void main(String[] args) {
       /* List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(10);
        System.out.println(list);*/
        /*Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(10);
        System.out.println(q);
        Iterator<Integer> it= q.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        /*offer(), poll(), peek(), isEmpty()*/
        List<Student> l=new ArrayList<>();
        l.add(new Student("Kamalika", 155));
        l.add(new Student("Srijit", 156));
        l.add(new Student("Subhra", 154));
        l.add(new Student("Souhardo", 157));
        Collections.sort(l);
        /*Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        */
        Collections.sort(l, (o1,o2)-> o1.name.compareTo(o2.name));
        System.out.println(l);
    }
}
