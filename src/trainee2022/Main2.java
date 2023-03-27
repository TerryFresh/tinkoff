package trainee2022;
//Аня — координатор стажировок в Тинькофф. Она хочет нанять самых сильных олимпиадников.
//Для того чтобы понять, кто же лучший, Аня решила проанализировать результаты командной олимпиады за последние N лет.
// Она знает все команды, занявшие первое место. Каждая команда задается тройкой имен, причем их порядок не важен,
// то есть записи ANTON BORIS CHRIS и BORIS ANTON CHRIS задают одну и ту же команду.
//Ане нужны лучшие из лучших, поэтому она хочет знать, какое максимальное число раз побеждала команда в одном и том же составе.
// Вы дружите с Аней, поэтому согласились ей помочь

//Формат входных данных
//В первой строке входного файла задано одно целое число N
// (1≤N≤103)N — количество лет, за которые у Ани есть данные.
//В следующих N строках заданы команды-победители: в каждой строке указаны три разделенных пробелом имени.
// Каждое имя имеет длину от 1 до 10 символов,
// а также стоит из заглавных латинских символов (A, ..., Z)(A,...,Z).
//Формат выходных данных
//
//В единственной строке выведите число — максимальное число побед команды в одинаковом составе.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            String[] wordSplit = bufferedReader.readLine().split(" ");
            Arrays.sort(wordSplit);
            array[i] = "";
            for (int j = 0; j < wordSplit.length; j++) {
                array[i] += wordSplit[j];
            }
        }
        int result = 0;
        int result2 = 0;

        for (int i = 0; i < n; i++) {
            if (result2 > result) {
                result = result2;
                result2 = 0;
            }
            for (int j = 1; j < n; j++) {
                if (array[i].equals(array[j])){
                    result2 += 1;
                }
            }
        }
        System.out.println(result);
    }
}
