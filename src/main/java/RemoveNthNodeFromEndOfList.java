public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }
        if (size == 1 && n == 1) {
            return null;
        }
        int skipOn = size - n;

        if(skipOn == 0){
            return head.next;
        }
        currentNode = head;
        int counter = 1;
        while (currentNode.next != null) {
            if (skipOn == counter) {
                if (currentNode.next.next != null) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                }
                break;
            }
            currentNode = currentNode.next;
            counter++;
        }

        return head;
    }

}
