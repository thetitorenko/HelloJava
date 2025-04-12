public class Variables {
    public static void main(String[] str) {
        int age = 36;
        double temp = 36.6;
        char grade = 'A';
        boolean isAdmin = false;
        String name = "Nikita";

        // Конкатенация переменных
        System.out.println(name + " получил оценку " + grade);
        System.out.println("Админ? " + isAdmin);
        System.out.println();

        // Эканирование переменной
        System.out.println(name + " сказал: \"Привет, мир!\"");
        System.out.println("Путь: C:\\Users\\Nikita");
        System.out.println();

        // Перенос строк и табуляция
        System.out.println("Имя:\t" + name);
        System.out.println("Возраст:\n" + age);
        System.out.println();

        // Расчет прямо в выводе
        System.out.println("Через 5 лет тебе будет: " + (age + 5));
        System.out.println("Температура в Фаренгейтах " + (temp * 1.8 + 32));
        System.out.println();

        // Форматированный вывод
        System.out.printf("Имя: %s | Возраст: %d | Температура: %.1f°C", name, age, temp);
    }
}