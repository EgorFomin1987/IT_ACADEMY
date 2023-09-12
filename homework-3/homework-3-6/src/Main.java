public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 20;
        int c = -9;
        if ((Math.pow(b,2) - 4 * a * c) < 0){
            System.out.println("корней нет");
        }else if(a == 0 && c == 0){
            System.out.println("корней бесконечное множество");
        }else if((Math.pow(b,2) - 4 * a * c) > 0) {
            System.out.print("Первый корень уравнения ");
            System.out.println(((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            System.out.print("Второй корень уравнения ");
            System.out.println(((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        }
    }
}

