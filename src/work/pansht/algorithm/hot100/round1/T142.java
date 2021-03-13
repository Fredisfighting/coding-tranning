package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/20
 */
public class T142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fastNode = head, slowNode = head;
        for (; fastNode != null && fastNode.next!=null; ) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode.equals(slowNode)) {
                break;
            }
        }
        if (fastNode == null || fastNode.next == null) {
            return null;
        }
        fastNode = head;
        for (; !fastNode.equals(slowNode); ) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return fastNode;
    }
}
