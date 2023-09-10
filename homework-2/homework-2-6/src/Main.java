public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int k = (a + b + c + d + e + f + g + h + i + j)/10;
        System.out.println("Целое " + k);
        int l = (a + b + c + d + e + f + g + h + i + j)%10;
        System.out.println("Остаток от деления " + l);
        double m = (a + b + c + d + e + f + g + h + i + j)/10;
        System.out.println(m);
        /* Как я понял компилятор считает действие как инт и ему надо указать,
        что мы в итоге хотим дробное число
         */
        double n = (a + b + c + d + e + f + g + h + i + j)/10.0;
        System.out.println(n);

    }
}
