package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/23
 */
public class T206 {
    public ListNode reverseList(ListNode head) {
        ListNode head0 = new ListNode(0);
        ListNode node = head;
        ListNode pre;
        while (node != null) {
            pre = head0.next;
            head0.next = node;
            node = node.next;
            head0.next.next = pre;
        }
        return head0.next;
    }
}
