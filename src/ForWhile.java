public class ForWhile {
    public static void main(String[] str) {

        // Цикл for с переменной i, которая начинается с 0 и увеличивается на 1 до 4
        System.out.print("Цикл for с 0 до 4:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // Цикл while, который выполняется, пока i меньше 5
        System.out.print("Цикл while с 0 до 5:\n");
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;    // аналог i = i +1
        }

        // Цикл while от 10 до 1
        System.out.print("Цикл while от 10 до 1\n");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j = j - 1;
        }
    }
}