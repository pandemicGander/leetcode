class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode currentNode = this;
        StringBuilder output = new StringBuilder(String.valueOf(this.val));
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            output.append(' ').append(currentNode.val);
        }
        return output.toString();
    }

    public static ListNode createListNodes(int[] nodes){
        if (nodes.length == 0){
            return new ListNode();
        }
        ListNode currentNode = new ListNode(nodes[0]);
        for (int i = 1; i < nodes.length; i++) {
            currentNode = new ListNode(nodes[i], currentNode);
        }
        return currentNode;
    }
}

