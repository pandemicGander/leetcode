import java.math.BigDecimal;

public class AddingTwoNumbers {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigDecimal sum1 = getNumber(l1);
        BigDecimal sum2 = getNumber(l2);

        BigDecimal add = sum1.add(sum2);

        String[] split = String.valueOf(add).split("");

        ListNode currentNode = new ListNode(Integer.parseInt(split[0]));

        for (int i = 1; i < split.length; i++) {
            currentNode = new ListNode(Integer.parseInt(split[i]), currentNode);
        }

        return currentNode;
    }


    public BigDecimal getNumber(ListNode node) {
        ListNode currentNode = node;
        StringBuilder output = new StringBuilder();
        output.append(currentNode.val);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            output.append(currentNode.val);
        }
        output.reverse();
        return new BigDecimal(output.toString());
    }

}

