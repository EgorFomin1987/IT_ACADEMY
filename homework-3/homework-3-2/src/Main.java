public class Main {
    public static void main(String[] args) {
        int month = 10;
        if (month < 3 || month > 11) {
            System.out.println("Зима");
        }else if (month > 2 && month < 6){
            System.out.println("Венса");
        } else if (month > 5 && month < 9) {
            System.out.println("Лето");
        } else if (month > 8 && month < 12) {
            System.out.println("Осень");
        }
    }
}
