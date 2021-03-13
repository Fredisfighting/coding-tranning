package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/17
 */
public class T19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode fastNode = h;
        ListNode slowNode = h;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        for (; fastNode != null && fastNode.next != null; ) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode.next = slowNode.next.next;
        return h.next;
    }
}
