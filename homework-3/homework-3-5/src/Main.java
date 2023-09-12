public class Main {
    public static void main(String[] args) {
        /*
        Пусть x и y координаты точки
         */
        int x = 1;
        int y = -5;
        if (x > 0 && y > 0){
            System.out.println("Первая четверть");
        }else if (x < 0 && y > 0){
            System.out.println("Вторая четверть");
        }else if (x < 0 && y < 0){
            System.out.println("Третья четверть");
        }else
            System.out.println("Четвертая четверть");;
    }
    /*
    Случаи когда точка лежит на осях не прописывал, но если надо - можно
     */
}
