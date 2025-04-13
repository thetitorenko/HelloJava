import java.util.Scanner;   // для считывания данных с клавиатуры
import java.util.Set;

public class IfElse {
    public static void main(String[] str) {

        // Экземпляр класса Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрос возраста у пользователя
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // Проверка возраста и вывод соответствующего сообщения
        if (age < 0) {
            System.out.println("Ошибка! Неравильный возраст");
        } else if (age == 0) {
            System.out.println("Возраст не может быть равен нулю");
        } else if (age > 0 && age < 13) {
            System.out.println("Ребенок");
        } else if (age <= 18) {
            System.out.println("Подросток");
        } else if (age <= 60) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пожилой");
        }

        // Закрытие сканера
        scanner.close();
    }
}