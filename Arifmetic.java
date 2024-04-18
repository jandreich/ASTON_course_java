public class Arifmetic {

    private static long operCount;

    public static int sum (int a, int b) {
        operCount++;
        return a+b;
    }

    public static int dif (int a, int b) {
        operCount++;
        return a-b;
    }

    public static long operationCount () {
        return operCount;
    }

}
