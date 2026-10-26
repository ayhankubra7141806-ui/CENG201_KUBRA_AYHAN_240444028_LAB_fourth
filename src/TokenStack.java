/**
 * TokenStack.java
 *
 * Your Name:KÜBRA AYHAN
 * Your Student ID:240444028
 * Your Date:26/10/2026
 */

public class TokenStack {

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;

    public TokenStack() {
        top = null;
    }

    public void push(String value) {
        // TODO: Create a new node.
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        if (isEmpty()) {
            return null;
        }

        String value = top.data;
        top = top.next;
        return value;
    }
    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return top == null;
    }
}
