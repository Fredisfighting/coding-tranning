package work.pansht.algorithm.hot100.round1;

import work.pansht.algorithm.hot100.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Fred
 * @createTime 2021/01/21
 */
public class T148 {
    public ListNode sortList(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        for (; curr != null; ) {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list, (l1, l2)->  l1-l1);
        ListNode ans = new ListNode(0);
        curr = ans;
        for (Integer i : list) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return ans.next;
    }
}
