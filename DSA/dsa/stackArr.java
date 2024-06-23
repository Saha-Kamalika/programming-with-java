package dsa;
class Stack{
    static int size=5;
    int top;
    int arr[]=new int[size];
    Stack(){};
    Stack(int size){
        top=-1;

    }
    public void push(int data){
        if(isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=data;
        System.out.println(data+" successfully pushed");
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        System.out.println(arr[top]+" successfully popped");
        top--;
        return 0;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Cannot peek");
            return;
        }
        System.out.println(arr[top]+" peeked");
    }
    public boolean isFull(){
        if(top==size-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class stackArr {

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.peek();
        s.isEmpty();
        s.isFull();
        s.pop();
        s.push(7);
        s.display();
    }
}
