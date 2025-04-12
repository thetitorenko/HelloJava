import java.util.Scanner;   // для считывания данных с клавиатуры

public class IfElse {
    public static void main(String[] str) {

        // Экземпляр класса Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрос возраста у пользователя
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // Проверка возраста и вывод соответствующего сообщения
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        // Закрытие сканера
        scanner.close();
    }
}