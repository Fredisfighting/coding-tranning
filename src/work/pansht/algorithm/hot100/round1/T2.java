package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

/**
 * @author Fred
 * @createTime 2021/01/16
 */
public class T2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int tmp = 0;
        while (l1 != null || l2 != null || tmp != 0) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int plus = (n1 + n2 + tmp) % 10;
            tmp = (n1 + n2 + tmp) / 10;
            curr.next = new ListNode(plus);
            curr = curr.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return ans.next;
    }
}
