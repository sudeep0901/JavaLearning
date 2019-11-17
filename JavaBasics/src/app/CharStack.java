package app;

public class CharStack {

    private char[] stackArray;
    private int topOfStack;

    public CharStack(int n) {
        stackArray = new char[n];
        topOfStack = -1;
    }

    public void push(char element) {
        System.out.println(topOfStack++);
        System.out.println(topOfStack);
        // System.out.println(++topOfStack);
        // System.out.println(topOfStack);

        stackArray[++topOfStack] = element;

    }

    public char pop() {
        System.out.println(topOfStack--);
        System.out.println(--topOfStack);
        return stackArray[topOfStack--];
    }

    public char peek() {
        return stackArray[topOfStack];
    }

    public boolean isEmpty() {
        return topOfStack < 0;

    }

    public boolean isFull() {
        return topOfStack == stackArray.length - 1;
    }
}