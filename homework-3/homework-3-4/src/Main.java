public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int x = 12;
        /*
        понял как вызывать метод но все равно не понял,
        что возвращается в разборе в лекции, нужно пояснение, поэтому делал без метода.
         */
        if (x > a && x < b){
            System.out.println("Точка внутри отрезка");
            System.out.println("Расстояние от точки \"a\" " + (x - a));
            System.out.println("Расстояние от точки \"b\" " + (b - x));
        }else if( x == a ){
            System.out.println("Точка \"x\" cовпадает с точкой \"a\", длина " + a);
        }else if( x == b ){
            System.out.println("Точка \"x\" cовпадает с точкой \"b\", длина  " + b);
        }else if (x < a) {
            System.out.println("Точка \"x\" лежит левее отрезка, на расстоянии " + (a - x) + " от точки \"a\"");
        }else
        System.out.println("Точка \"x\" лежит правее отрезка, на расстоянии " + (x - b) + " от точки \"b\"");
    }
}
