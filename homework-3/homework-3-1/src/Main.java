public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 8;
        if (x > z) {
/*
Не могу понять почему IDE пытается меня исправить и убрать фигурные скобки.
 */
            System.out.println((x + y)/2);
        }
        else
        System.out.println(z);
    }
}
