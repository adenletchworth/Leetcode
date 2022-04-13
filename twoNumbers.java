
public class twoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode ret = new ListNode();
        ListNode head = ret;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            int cur = l1_val + l2_val + carry;
            carry = cur/10;
            ListNode newNode = new ListNode(cur%10);
            head.next = newNode;
            head = head.next;
        }
        return ret.next;
    }
}
