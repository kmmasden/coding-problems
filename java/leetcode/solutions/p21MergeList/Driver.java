package solutions.p21MergeList;

public class Driver {
    public static void  main(String args[]) {
        Solution solution = new Solution();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode result = solution.mergeTwoLists(node1, node4);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
