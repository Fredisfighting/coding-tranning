package work.pansht.algorithm.hot100.round2;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/20
 */
public class T19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        if (fastNode == null) {
            return head.next;
        }
        for (; fastNode.next != null; ) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode.next = slowNode.next.next;
        return head;
    }
}
