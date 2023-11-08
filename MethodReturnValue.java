public class MethodReturnValue {

    public static void main(String[] args) {
       var result =  sum(4, 5);
       System.out.println(result);
    }

    static int sum(int value1, int value2) {
        return value1 + value2;
    }
}
