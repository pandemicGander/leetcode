import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListNodeTest {

    @Test
    void createConnectedNodes() {
        ListNode result = ListNode.createListNodes(new int[] {1, 1, 2, 3, 5, 8});
        Assertions.assertEquals("8 5 3 2 1 1", result.toString());
    }
}