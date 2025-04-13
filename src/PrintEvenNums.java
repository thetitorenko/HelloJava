import java.util.Scanner;

// Программа для вывода четных чисел в заданном диапазоне
public class PrintEvenNums {
    public static void main(String[] str) {

        Scanner scanner = new Scanner(System.in);

        // Запрос правой границы диапазона у пользователя
        System.out.print("Введите правую границу диапазона: ");
        int rangeNum = scanner.nextInt();

        // Счетчик четных чисел до введенного числа
        for (int i = 0; i < rangeNum + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}