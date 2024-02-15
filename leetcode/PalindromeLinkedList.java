
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode cur = head;
        ListNode reverse = reverseListNode(head);
        cur = head;
        while (cur != null) {
            if (cur.val != reverse.val) {
                return false;
            }
            cur = cur.next;
            reverse = reverse.next;
            System.out.println(cur.val);
        }
        return true;

    }

    public ListNode reverseListNode(ListNode head) {

        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        for (ListNode reverse = pre; reverse != null; reverse = reverse.next) {
            System.out.println(reverse.val);
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.add(1);
        a.add(2);
        a.add(1);

        PalindromeLinkedList b = new PalindromeLinkedList();
        // b.reverseListNode(a);
        b.isPalindrome(a);
    }
}
