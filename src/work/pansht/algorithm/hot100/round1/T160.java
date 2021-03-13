package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/22
 */
public class T160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA, node2 = headB;
        if (node1 == null || node2 == null) {
            return null;
        }
        for (; node1 != node2; ) {
            if (node1 == null) {
                node1 = headB;
            }
            if (node2 == null) {
                node2 = headA;
            }
            if (node1 == node2) {
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
