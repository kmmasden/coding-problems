package solutions.p21MergeList;

public class Solution {

    //comment out
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //If either list is empty, return other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        //Create new List node that is empty with reference to it as 'head of list'
        ListNode resultList = new ListNode();
        ListNode headOfList = resultList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                resultList.next = list1;
                list1 = list1.next;
            } else {
                resultList.next = list2;
                list2 = list2.next;
            }
            resultList = resultList.next;
        }

        if (list1 == null) {
            resultList.next = list2;
        } else {
            resultList.next = list1;
        }

        return headOfList.next;
    }
}
