import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingTwoNumbersTest {

    @Test
    void test(){
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(6, listNode4);
        ListNode listNode6 = new ListNode(5, listNode5);

        ListNode listNode7 = new ListNode(8);
        ListNode listNode8 = new ListNode(0, listNode7);
        ListNode listNode9 = new ListNode(7, listNode8);

        ListNode result = new AddingTwoNumbers().addTwoNumbers(listNode3, listNode6);

        Assertions.assertEquals(result.toString(), listNode9.toString());

    }
    @Test
    void test2(){
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);

        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(4, listNode4);
        ListNode listNode6 = new ListNode(6, listNode5);
        ListNode listNode7 = new ListNode(5, listNode6);

        ListNode listNode8 = new ListNode(1);
        ListNode listNode9 = new ListNode(0, listNode8);
        ListNode listNode10 = new ListNode(4, listNode9);
        ListNode listNode11 = new ListNode(0, listNode10);
        ListNode listNode12 = new ListNode(7, listNode11);

        ListNode result = new AddingTwoNumbers().addTwoNumbers(listNode3, listNode7);

        Assertions.assertEquals(result.toString(), listNode12.toString());

    }

}