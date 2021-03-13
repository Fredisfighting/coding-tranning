package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/19
 */
public class T141 {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        for (; fastNode != null && fastNode.next != null; ) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode.equals(fastNode)) {
                return true;
            }
        }
        return false;
    }
}
