public class Main {
    public static void main(String[] args) {
        int a = 360;//Номер дня года
        int b1 = 13;//Номер месяца
        int b2 = 5;//Номер дня месяца
        int c = 1;//Порядковый номер дня недели
        /*
        В конце пробовал ттернальный оператор чтобы выводило будни или выходные,
        но почему-то так и не получилоссь((
         */
        System.out.print((a - (a/28)*28) + " ");

        if (a >= 1 && a <= 28) {
            System.out.print("Января, ");
        } else if (a > 28 && a <= 56) {
            System.out.print("Февраля, ");
        } else if (a > 56 && a <= 84) {
            System.out.print("Марта, ");
        } else if (a > 84 && a <= 112) {
            System.out.print("Апреля, ");
        } else if (a > 112 && a <= 140) {
            System.out.print("Мая, ");
        } else if (a > 140 && a <= 168) {
            System.out.print("Июня, ");
        } else if (a > 168 && a <= 196) {
            System.out.print("Июля, ");
        } else if (a > 196 && a <= 224) {
            System.out.print("Августа, ");
        } else if (a > 224 && a <= 252) {
            System.out.print("Сентября, ");
        } else if (a > 252 && a <= 280) {
            System.out.print("Октября, ");
        } else if (a > 280 && a <= 308) {
            System.out.print("Ноября, ");
        } else if (a > 308 && a <= 336){
            System.out.print("Декабря, ");
        }else if(a > 336 && a <= 364){
            System.out.print("Бредября, ");
        }


        if ((a - ((a / 7) * 7)) == 1){
            System.out.println("понедельник");
        }else if ((a - ((a / 7) * 7)) == 2){
            System.out.println("вторник");
        }else if((a - ((a / 7) * 7)) == 3){
            System.out.println("среда");
        }else if((a - ((a / 7) * 7)) == 4){
            System.out.println("четверг");
        }else if((a - ((a / 7) * 7)) == 5){
            System.out.println("пятница");
        }else if((a - ((a / 7) * 7)) == 6){
            System.out.println("суббота");
        }else if((a - ((a / 7) * 7)) == 0){
            System.out.println("воскресенье");
        }
        System.out.print(b2 + " ");
    if (b1 * 28 == 28){
        System.out.print("Января, ");
    }else if (b1 * 28 == 56){
        System.out.print("Февраля, ");
    }else if (b1 * 28 == 84){
        System.out.print("Марта, ");
    }else if (b1 * 28 == 112){
        System.out.print("Апреля, ");
    }else if (b1 * 28 == 140){
        System.out.print("Мая, ");
    }else if (b1 * 28 == 168){
        System.out.print("Июня, ");
    }else if (b1 * 28 == 196){
        System.out.print("Июля, ");
    }else if (b1 * 28 == 224){
        System.out.print("Августа, ");
    }else if (b1 * 28 == 252){
        System.out.print("Сентября, ");
    }else if (b1 * 28 == 280){
        System.out.print("Октября, ");
    }else if (b1 * 28 == 308){
        System.out.print("Ноября, ");
    }else if (b1 * 28 ==336){
        System.out.print("Декабря, ");
    }else if (b1 * 28 ==364){
        System.out.print("Бредября, ");
    }
        if ((b2 - ((b2 / 7) * 7)) == 1){
            System.out.println("понедельник");
        }else if ((b2 - ((b2 / 7) * 7)) == 2){
            System.out.println("вторник");
        }else if((b2 - ((b2 / 7) * 7)) == 3){
            System.out.println("среда");
        }else if((b2 - ((b2 / 7) * 7)) == 4){
            System.out.println("четверг");
        }else if((b2 - ((b2 / 7) * 7)) == 5){
            System.out.println("пятница");
        }else if((b2 - ((b2 / 7) * 7)) == 6){
            System.out.println("суббота");
        }else if((b2 - ((b2 / 7) * 7)) == 0) {
            System.out.println("воскресенье");
        }
    if (c % 6 == 0 || c % 7 == 0){
        System.out.println("Выходные");
        }else
        System.out.println("Будни");
    }
}
