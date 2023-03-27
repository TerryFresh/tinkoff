package trainee2023;

// Дана строка s, состоящая из символов a,b,c и d.

// Подстрокой строки s называется строка, которую можно получить, взяв из s какие-то подряд идущие символы.
// Например, строки bcd, abcdcdab, cdcdab являются подстроками abcdcdab, а сс и cdcdcd - нет.

// Назовём строку хорошей, если каждый из символов a,b,c и d встречается в нея хотя бы один раз.
// Найдите длину самой короткой хорошей подстроки строки s или определите, что у s нет хороших подстрок

// Выведите длину самой короткой хорошей подстроки строки s. Если хороших подстрок нет, выведите -1.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {

//        String s = "abcdcdab";
//        String s = "abbbbbbbbcdcdab";
//        String s = "abbb";
//        String s = "abbcd";
//        String s = "aaaaaaaaabbbbbbbbbbbcccccccccccccccdddddddddddddddd";
//        System.out.println(goodShortestSubString(s));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String values = reader.readLine();
        System.out.println(goodShortestSubString(values));
    }

    public static int goodShortestSubString(String s) {
        for (int i = 4; i <= s.length(); i++) {
            for (int j = 0; j < s.length()-i+1; j++) {
                String substring = s.substring(j, j + i);
                if (substring.contains("a")
                        && substring.contains("b")
                        && substring.contains("c")
                        && substring.contains("d")) {
                    return i;
                }
            }
        }
        return -1;
    }
}
