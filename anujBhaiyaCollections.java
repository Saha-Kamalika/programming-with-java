package classFiles;
import java.util.*;
public class anujBhaiyaCollections {
public class anujBhaiyaCollections {
    public static void main(String[] args) {
        //ArrayList implementing List class
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        //printing the list
        //method 1 using traditional for loop
        int i;
        for (i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
        //method 2 using for-each loop
        for (Integer i1 : list)
            System.out.print(i1 + " ");
        System.out.println();
        //method 3 using iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //Stack implementation
        Stack<String> s = new Stack<>();
        s.push("ram");
        s.push("sam");
        s.push("khyam");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
        //LinkedList implementing queue class
        Queue<String> q = new LinkedList<>();
        q.offer("ram");
        q.offer("sam");
        q.offer("khyam");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
        //Priority queue
        Queue<Integer> pq = new PriorityQueue<>(); //by default min heap
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); //max heap
        pq.offer(10);
        pq.offer(30);
        pq.offer(15);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
        //ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque();
        ad.add(10);
        ad.add(15);
        ad.add(30);
        ad.addFirst(1);
        ad.offerFirst(0);  //same as above
        ad.removeFirst();
        ad.pollFirst(); //same as above
        for (Integer e : ad)
            System.out.print(e + " ");
        System.out.println();
        //HashSet
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(9);
        hs.add(4);
        hs.add(7);
        hs.add(1);
        for (Integer i1 : hs)
            System.out.print(i1 + " ");
        System.out.println();
        System.out.println(hs.contains(0));
        hs.clear();
        System.out.print(hs);
        Set<Integer> hs1 = new LinkedHashSet<>(); //elements inserted in order
        Set<Integer> hs2 = new TreeSet<>(); //elements stored in sorted order
        Map<String, Integer> m = new HashMap<>();
        m.put("One", 1);
        m.put("two", 2);
        m.put("three", 3);
        System.out.print(m);
        //m.putIfAbsent(Object);
        //m.containsValue(Object);
        //m.remove(Object);
        //CollectionsClass
        //Collections.min(list))
        //Collections.frequency(list)
        //Collections.sort(collection)
        /*
        Collections.sort(collections, new Comparator<Object>()){
            public int compare(String s1,String s2){
                return s1.property.compareTo(s2.property);
            }
        }
        */
    }
    }
}
