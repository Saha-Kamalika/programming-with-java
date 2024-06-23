package dsa;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedList {
    public static Node head;
    linkedList(){
        this.head=null;
    }
    public void push(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=nn;
        }
    }
    public void remove(int data){
        if(head==null) return;
        if(head.data==data) {
            head=head.next;
        }
        Node curr=head,prev=null;
        while(curr!=null && curr.data!=data){
            prev=curr;
            curr=curr.next;
        }
        if(curr!=null){
            prev.next=curr.next;
        }
    }
    public void display(){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("Total nodes: "+count);
        System.out.println();
    }
    public int getCount(Node n){
        if(n==null) return 0;
        return 1+getCount(n.next);
    }
    public int gett(){
        return getCount(head);
    }
    Node reverse(){
        Node curr=head, prev=null, next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public int getNode(int n){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            if(count==n) return curr.data;
            curr=curr.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.display();
        ll.remove(2);
        ll.display();
        ll.push(4);
        ll.display();
        System.out.println(ll.gett());
        head=ll.reverse();
        ll.display();
        System.out.println(ll.getNode(9));
    }
}
