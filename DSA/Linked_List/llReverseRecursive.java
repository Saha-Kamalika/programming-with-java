package classFiles;
import java.util.*;
class llReverseRecursive{
    Node head;
    private int size;
    llReverseRecursive(){
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
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null)
            return head;
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
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
    }
    public static void main(String[] args)
    {
        llReverseRecursive list=new llReverseRecursive();
        list.addLast("hi");
        list.addLast("I am");
        list.addLast("Kamalika Saha");
        list.printList();
        System.out.println(list.getSize());
        list.head=list.reverseRecursive(list.head);
        System.out.println("The reversed linked list is: ");
        list.printList();
    }
}