public class ForWhile {
    public static void main(String[] str) {

        // Цикл for с переменной i, которая начинается с 0 и увеличивается на 1 до 4
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();


        // Цикл while, который выполняется, пока i меньше 5
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;    // аналог i = i +1
        }
    }
}