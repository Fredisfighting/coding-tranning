package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2020/12/19
 */
public class T23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int n = lists.length;
        while (true) {
            ListNode next = null;
            int ind = -1;
            int min = 999999;
            for (int i = 0; i < n; i++) {
                ListNode node = lists[i];
                if (node == null) {
                    continue;
                }
                if (node.val < min) {
                    min = node.val;
                    ind = i;
                    next = node;
                }
            }
            if (ind == -1) {
                break;
            }
            current.next = next;
            current = next;
            lists[ind] = lists[ind].next;
        }
        return head.next;
    }
}
