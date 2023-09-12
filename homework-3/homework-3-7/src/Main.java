public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 17;
        int d = -65;
        int e = 112;

        /*
        Не очень понял, что делать если например два или три числа равны, то код не выводит
        минимальное или максимальное значение
         */

        if (a == b && a == c && a == d && a == e){
            System.out.println("Числа равны между собой");
        }

        if (a > b && a > c && a > d && a > e) {
            System.out.println("Максимальное число <a> со значением " + a);
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("Максимальное число <b> со значением " + b);
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("Максимальное число <c> со значением " + c);
        } else if (d > a && d > b && d > c && d > e) {
            System.out.println("Максимальное число <d> со значением " + d);
        } else if (e > a && e > b && e > c && e > d) {
            System.out.println("Максимальное число <e> со значением " + e);
        };
        if (a < b && a < c && a < d && a < e) {
            System.out.println("Минимальное число <a> со значением " + a);
        } else if (b < a && b < c && b < d && b < e) {
            System.out.println("Минимальное число <b> со значением " + b);
        } else if (c < a && c < b && c < d && c < e) {
            System.out.println("Минимальное число <c> со значением " + c);
        } else if (d < a && d < b && d < c && d < e) {
            System.out.println("Минимальное число <d> со значением " + d);
        } else if (e < a && e < b && e < c && e < d) {
            System.out.println("Минимальное число <e> со значением " + e);
        }
    }
}

