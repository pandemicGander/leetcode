import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void test() {
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{5, 4, 3, 2, 1}), 2);
        Assertions.assertEquals(ListNode.createListNodes(new int[]{5, 3, 2, 1}).toString(), result.toString());

        ListNode result2 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{5}), 1);
        Assertions.assertNull(result2);

        ListNode result3 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{2, 1}), 1);
        Assertions.assertEquals(ListNode.createListNodes(new int[]{1}).toString(), result3.toString());

        ListNode result4 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{7, 6, 5, 4, 3, 2, 1}), 6);
        Assertions.assertEquals(ListNode.createListNodes(new int[]{7, 6, 5, 4, 3, 1}).toString(), result4.toString());

        ListNode result5 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{2, 1}), 2);
        Assertions.assertEquals(ListNode.createListNodes(new int[]{2}).toString(), result5.toString());

        ListNode result6 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(ListNode.createListNodes(new int[]{3, 2, 1}), 3);
        Assertions.assertEquals(ListNode.createListNodes(new int[]{3, 2}).toString(), result6.toString());
    }
}