public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // TODO 2
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // TODO 3
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    // TODO 4
    public boolean isEmpty() {
        return top == null;
    }
}