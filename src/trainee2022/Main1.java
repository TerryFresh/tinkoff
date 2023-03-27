package trainee2022;//64 МБ 1 sec
//На стандартном потоке ввода задаются два целых числа, не меньшие -32000 и не большие 32000.
//На стандартный поток вывода напечатайте сумму этих чисел.
//Числа задаются по одному в строке. Пробельные символы перед числом и после него отсутствуют.
//Пустые строки в вводе отсутствуют.
//Примеры данных:
//1 + 2 = 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long input1 = 32001;
        long input2 = 32001;
        boolean res = false;

        while (!res) {
            System.out.println("Write first number from -32000 to 32000 include");
//            try {
                input1 = Long.parseLong(reader.readLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Wrong number");
//            }

            if (input1 <= 32000 && input1 >= -32000) {
                System.out.println("First number is " + input1);
                res = true;
            } else System.out.println("Wrong number");
        }

        res = false;

        while (!res) {
            System.out.println("Write second number from -32000 to 32000 include");
//            try {
                input2 = Long.parseLong(reader.readLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Wrong number");
//            }

            if (input2 <= 32000 && input2 >= -32000) {
                System.out.println("Second number is " + input2);
                res = true;
            } else System.out.println("Wrong number");
        }


        long sum = input1 + input2;

        System.out.println(sum);
    }
}
