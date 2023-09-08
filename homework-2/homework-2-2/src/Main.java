public class Main {
    public static void main(String[] args) {
        int z = 2147483647 + 1;
        System.out.println(z);
        long a = z;
        System.out.println(a);
        //Результат не меняется, т.к компилятор считает 2147483647 интом и он//
        // уже переполняет его соответственно знак отрицательный//
        long b = 2147483647L + 1;
        System.out.println(b);
        long c = z;
        System.out.println(Math.abs(c));
    }
}
