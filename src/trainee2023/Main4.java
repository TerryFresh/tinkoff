package trainee2023;

// Набор чисел X1....Xn назовём "скучным", если возможно удалить из него один элемент так, что бы каждое число
// в данном наборе встречалось одинаковое кол-во раз.

// Дан массив A1....An. Найдите максимальное число l (2 <= l <= An), что префикс длины l является скучным.

// Формат входных данных
// Первая строка содержит число n - размер массива. Во второй строке находится n чисел из массива A.

// Выведите одно число - максимальное l, что префикс длины l массива A являются скучным.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) throws IOException {

//        String s = "1 2 3 1 2 2 3 3 3 1 4 4 5";            //10
//        String s = "1 2 4 2 3 1 3 9 15 23";                //7
//        String s = "1 2 3 4 5";                            //5
//        System.out.println(deep(s));

//        int[] array = new int[]{1, 2, 3, 1, 2, 2, 3, 3, 3, 1, 4, 4, 5};    //10
//        int[] array = new int[]{1, 2, 4, 2, 3, 1, 3, 9, 15, 23};           //7
//        int[] array = new int[]{1, 2, 2, 3, 1, 3, 9, 15, 23};           //7
//        int[] array = new int[]{1, 2, 2, 3, 4, 5};                         //5
//        int[] array = new int[]{1, 2, 3, 4, 5};                            //5
//        System.out.println(deep(array));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String values = reader.readLine();
        String[] valuesSplit = values.split(" ");
        int[] array = new int[values.split(" ").length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(valuesSplit[i]);
        }

        System.out.println(deep(array));
    }

    public static int deep(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int y = map.get(array[i]);
                y += 1;
                map.put(array[i], y);
            }
        }

        int lose = 0;
        boolean boo = true;

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[0]) == map.get(array[i])) {
                lose++;
            } else if (map.get(array[0]) == map.get(array[i])-1 || map.get(array[i])-1 == 0 && boo == true) {
                boo = false;
                int y = map.get(array[i]);
                y -= 1;
                map.put(array[i], y);
                lose++;
            }
        }
        return lose;
    }
}
