public class findLoopsInLL {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) //meeting pt
                return true;
        }
        return false;
    }
}
