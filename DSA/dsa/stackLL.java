package dsa;

public class stackLL {
    StackNode root;
    class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data=data;
        }
    }
    public void push(int data){
        StackNode nn=new StackNode(data);
        if(root==null){
            root=nn;
        }
        else {
            StackNode temp = root;
            root = nn;
            nn.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
    public int pop(){
        int popp=Integer.MIN_VALUE;
        if(root==null) {
            System.out.println("Stack empty");
        }
        else{
            popp=root.data;
            root=root.next;
        }
        return popp;
    }
    public int peek(){
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
    public boolean isEmpty(){
        if(root==null) return true;
        return false;
    }

    public static void main(String[] args) {
        stackLL s=new stackLL();
        if(s.isEmpty()) System.out.println("empty");
        else System.out.println("not empty");
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop()
                + " popped from stack");

        System.out.println("Top element is " + s.peek());
        if(s.isEmpty()) System.out.println("empty");
        else System.out.println("not empty");
    }
}
