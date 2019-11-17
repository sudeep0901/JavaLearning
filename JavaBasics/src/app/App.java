package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        CharStack stack1;
        CharStack stack2;

        stack1 =  new CharStack(10);
        stack2 = new CharStack(5);
        stack1.push('a');

    }
}