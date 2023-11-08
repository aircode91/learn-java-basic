public class MathematicOperator {
    public static void main(String[] args) {

        int a = 100;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Asssignment
        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        // Unary Operator
        int d = 50;

        d++;
        System.out.println(d);

        int e = 60;
        e--;
        System.out.println(e);

    }
}
