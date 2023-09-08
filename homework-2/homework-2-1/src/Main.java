public class Main {
    public static void main(String[] args) {
        //Переменные уже написал в даубле, когда были в инте - все было также, но частное было равно 0,//
        //так как инт не работает с дробными//
        double x; x = 5;
        double y; y = 7;
        double b; b = x + y;
        double c; c = x - y;
        double g; g = x * y;
        double h; h = x / y;
        String a = "Сумма чисел ";
        String f = "Разность чисел ";
        System.out.println(a + b );
        System.out.println(f + c );
        System.out.println("Произведение чисел " + g );
        System.out.println("Частное чисел " + h );
    }
}
