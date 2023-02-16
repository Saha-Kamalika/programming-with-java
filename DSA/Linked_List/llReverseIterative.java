package classFiles;
import java.util.*;
class llReverseIterative{
    Node head;
    private int size;
    llReverseIterative(){
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
    public void reverseIterative(){
        if(head==null || head.next==null)
            return;
        Node prev=head,curr=head.next;
        while(curr!=null)
        {
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;
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
        llReverseIterative list=new llReverseIterative();
        list.addLast("hi");
        list.addLast("I am");
        list.addLast("Kamalika");
        list.printList();
        System.out.println(list.getSize());
        list.reverseIterative();
        System.out.println("The reversed linked list is: ");
        list.printList();
    }
}
//////Using COLLECTION
