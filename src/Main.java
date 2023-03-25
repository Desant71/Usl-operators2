import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите год в формате уууу");
            int year = sc.nextInt();

            if(year % 400 == 0 ){
                System.out.println("В году точно 366 дней");
            }else if (year % 100 == 0){
                System.out.println("В году точно 365 дней");
            }else if (year % 4 == 0){
                System.out.println("В году точно 366 дней");
            }else if (year % 4 != 0){
                System.out.println("В году точно 365 дней");
            }
        }
    }
}