class delNthNodeLeetCode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head;
        ListNode ptr1=head;
        int i=0,j=1;
        if(head.next==null)
            return null;
        while(ptr!=null){
            ptr=ptr.next;
            i++;
        }
        if(n==i)
            return head.next;
        int dif=i-n;
        while(j!=dif){
            ptr1=ptr1.next;
            j++;
        }
        ptr1.next=ptr1.next.next;
        return head;
    }
}