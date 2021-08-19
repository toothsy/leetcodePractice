package linkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Add2numbers {
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;


    }
    static void createll(ListNode l , int[] arr){
        l.val = arr[0];
        ListNode t = l;
        for(int i =1;i<arr.length;i++){
            t.next = new ListNode(arr[i]);
            t = t.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        createll(l1,new int[]{5});
        createll(l2,new int[]{5});
        ListNode t1 = l1;
        ListNode t2 = l2;
        while(t1!=null) {
            System.out.print(t1.val+" ");
            t1 = t1.next;
        }
        System.out.println();

        while(t2!=null) {
            System.out.print(t2.val+" ");
            t2 = t2.next;
        }

        System.out.println();

        ListNode t = addTwoNumbers(l1,l2);

        while(t!=null) {
            System.out.print(t.val+" ");
            t = t.next;
        }

        System.out.println();

    }
}
