package work.pansht.algorithm.hot100.round2;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/22
 */
public class T141 {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        for (; fastNode != null && fastNode.next != null; ) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode) {
                return true;
            }
        }
        return false;
    }
}
