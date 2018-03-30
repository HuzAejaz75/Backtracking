import java.util.ArrayList;

/**
 * Created by huzaifa.aejaz on 3/28/18.
 */
public class RemoveDulicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        return duplicateHelper(new ArrayList<>(), head,head, Integer.MATH_MIN)
    }
    private ListNode duplicateHelper(List<Integer> dups, ListNode head,ListNode node, int prev){

        if(node == null) return null;
        if(node.val == prev) dups.add(node.val);
        ListNode nextNode = duplicateHelper(dups, node.next, node.val);
        if(dups.contains(node.val)){
            return nextNode;
        }
        node.next = nextNode;
        return node;
    }
}
