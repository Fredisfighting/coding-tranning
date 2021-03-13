package work.pansht.algorithm.hot100.round2;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2020/12/22
 */
public class T23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode head = new ListNode(0);
            ListNode curr = head;
            int n = lists.length;
            while (true) {
                ListNode node = null;
                int min = 99999;
                int minInd = -1;
                for (int i = 0; i < n; i++) {
                    if (lists[i] != null && lists[i].val < min) {
                        node = lists[i];
                        min = lists[i].val;
                        minInd = i;
                    }
                }
                if (node == null) {
                    break;
                }
                curr.next=node;
                lists[minInd] = lists[minInd].next;
                curr = node;
            }
            return head.next;
        }
    }
}
