package Min_and_Max;

public class Main {
    public static void main(String[] args) {
        MinMax stack = new MinMax();
        stack.push(10);
        stack.push(234);
        stack.push(3);
        stack.push(1);
        stack.push(1);
        stack.push(1000);
        stack.push(30);
        stack.push(1000);
        stack.print();
        System.out.println("\nМаксимальный элемент = "+ stack.getMax());
        System.out.println("Минимальный элемент = "+ stack.getMin());


        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println("\nМаксимальный элемент = "+ stack.getMax());
        System.out.println("Минимальный элемент = "+ stack.getMin());
    }

}
