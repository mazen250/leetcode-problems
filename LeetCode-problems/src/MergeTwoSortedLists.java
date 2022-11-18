




public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempList = new ListNode(0);
        if(list2==null && list1==null) return null;
        if(list2==null) return list1;
        if(list1==null) return list2;
        if(list1.val<list2.val){
            tempList = list1;
            tempList.next = mergeTwoLists(list1.next,list2);
        }
        else{
            tempList = list2;
            tempList.next = mergeTwoLists(list1,list2.next);
        }

        return tempList;
    }

    public static void main(String[] args) {
        int n = 13;
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        System.out.println(n/2);
    }
}
