class checkLLPalindromeLeetCode{
    public ListNode middle(ListNode head){
        ListNode r=head,t=head;
        while(r.next!= null && r.next.next!=null){  //r is 2 node ahead of t, when this condition is reached, t points to the middle of the LL
            r=r.next.next;
            t=t.next;
        }
        return t;           //<= middle
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode firstEnd= middle(head);
        ListNode secStart=reverse(firstEnd.next); //reverses the second half of the LL(whose start is the value pointed by the next of firstEnd)
        ListNode firstStart=head;
        while(secStart!=null){
            if(secStart.val!=firstStart.val)
                return false;
            firstStart=firstStart.next;
            secStart=secStart.next;
        }
        return true;
    }
}
