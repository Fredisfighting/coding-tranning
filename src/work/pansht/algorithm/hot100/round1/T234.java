package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/24
 */
public class T234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fastNode = head, slowNode = head;
        ListNode pre = head, tmp = null;
        for (; fastNode != null && fastNode.next != null; ) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            pre.next = tmp;
            tmp = pre;
            pre = slowNode;
        }
        ListNode l1 = pre, l2 = fastNode == null ? slowNode : slowNode.next;
        for (; l1 != null; ) {
            if (l1.val != l2.val) {
                return false;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return true;
    }
}
