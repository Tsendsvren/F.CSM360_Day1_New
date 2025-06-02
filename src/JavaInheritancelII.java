class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Энэ класст нэмэлт код шаардлагагүй, учир нь add() method нь удамшсан.
}

public class JavaInheritancelII {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(20, 22) + " ");
        System.out.print(adder.add(6, 7) + " ");
        System.out.print(adder.add(10, 10));
    }
}
