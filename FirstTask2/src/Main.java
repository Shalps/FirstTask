import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш доход,округлите до целого числа");

        int income = scanner.nextInt();

        System.out.println("Введите ваши расходы и также округлите число");

        int spending = scanner.nextInt();

        int result = 0;
        System.out.println("для получения результата введите слово <<result>>");
        scanner.nextLine();

        if (scanner.nextLine().equals("result")) {
            result = income - spending;
            System.out.println("Итого:");
            System.out.println(result);
            if (result < spending) {
                System.out.println("ваши расходы привышают доходы");
            }
        } else System.out.println("увы программа сломалась, начните заново");
    }
}