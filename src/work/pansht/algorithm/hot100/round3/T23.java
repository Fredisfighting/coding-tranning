package work.pansht.algorithm.hot100.round3;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2020/12/27
 */
public class T23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (true) {
            int min = Integer.MAX_VALUE;
            int minInd = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    minInd = i;
                    min = lists[i].val;
                }
            }
            if (minInd == -1) {
                break;
            }
            curr.next = lists[minInd];
            lists[minInd] = lists[minInd].next;
            curr = curr.next;
        }
        return head.next;
    }
}
