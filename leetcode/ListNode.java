public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void add(int val) {
        ListNode a = new ListNode(val);
        ListNode cur;
        for (cur = this; cur.next != null; cur = cur.next)
            ;
        cur.next = a;
    }
}