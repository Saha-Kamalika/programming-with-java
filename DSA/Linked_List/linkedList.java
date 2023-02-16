package classFiles;
import java.util.*;
class linkedList {
    /*Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
        public void addFirst(String data)
        {
            Node nnode=new Node(data);
            if(head==null){
                head=nnode;
                return;
            }
            nnode.next=head;
            head=nnode;
    }
    public void addLast(String data)
    {
        Node nnode=new Node(data);
        if(head==null){
            head=nnode;
            return;
        }
        Node cnode=head;
        while(cnode.next!=null)
        {
            cnode=cnode.next;
        }
        cnode.next=nnode;
    }
    public void printList()
    {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        Node cnode=head;
        while(cnode!=null) {
            System.out.print(cnode.data + "->");
            cnode = cnode.next;
        }
        System.out.println("NULL");
    }
    public void delFirst()
    {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void delLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head == null){
            head=null;
            return;
        }
        Node secLast=head,last=head.next;
        while(last.next!=null){
            last=last.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    public int getSize(){
        return size;
    }*/
    public static void main(String[] args)
    {
        /*LL list=new LL();
        list.addFirst("hi");
        list.addLast("I am");
        list.printList();
        list.addLast("Kamalika");
        list.printList();
        list.delFirst();
        list.printList();
        System.out.println(list.getSize());*/
        LinkedList<String> ll=new LinkedList<String>();
        ll.addFirst("hi");
        ll.addLast("I am");
        ll.add("Kamalika");
        for(String s:ll)
            System.out.print(s+"->");
        System.out.println("NULL");
        ll.removeFirst();
        for(String s:ll)
            System.out.print(s+"->");
        System.out.println("NULL");
    }
}
//////Using COLLECTION
