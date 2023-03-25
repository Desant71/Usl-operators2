import java.util.Scanner;//импорт сканер

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//переменная сканер
        int ochki = 0;//переменная для очков
        while (true) {//цикл
            System.out.println("Введите год в формате уууу");//вывод с.
            int year = sc.nextInt();//переменная вводим год
            System.out.println("Введите количество дней");
            int dayIn = sc.nextInt();//перем. вводим день
            int dayOfYear = 0;//переменная кол дгей в голду

            if (year % 400 == 0) {//если
                dayOfYear = 366;
            } else if (year % 100 == 0) {//иначе
                dayOfYear = 365;
            } else if (year % 4 == 0) {//иначе
                dayOfYear = 366;
            } else if (year % 4 != 0) {//иначе
                dayOfYear = 365;
            }
            if (dayIn == dayOfYear) {//если
                System.out.println("Правильно");//сообщение
                ochki++;//плюсуем очки
            } else {//иначе
                System.out.println("Неправильно");
                System.out.println("Количесво очков: " + ochki);
                break;
            }
        }
    }
}