package trainee2023;

// В некоторой компании есть n-джунов и m-сеньоров. Что бы код, который написал джун, мог попасть в прод, его должны проверить хотя бы k сеньёоров.
// На проверку одной программы сеньор-разработчик тратит 1 минуту.

// Каждый из n джунов написал программу, которую хочет отправить в прод. К сожалению, система проверки пока не распределенная, поэтому два разработчика не могут
// проверять одну работу одновременно. Также сеньор разработчик хочет провести действительно хорошоее код-ревью,
// поэтому две программы одновременно он не проверяет и не отвлекается на другие дела во время проверки.

// Определите, сколько времени в минутах потребуется всем сеньорам для просмотра всех написанных джунами программ.

// Выведите одно число - суммарное время в минутах, которое потратят сеньоры на код-ревью.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
//        int junior = 7;
//        int senior = 3;
//        int review = 2;
//        String s = "7,3,2";
//        System.out.println(timeToReview(junior, senior, review));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String values = reader.readLine();
        System.out.println(timeToReview(values));
    }

    public static int timeToReview(String s) {
        String[] values = s.split(" ");
        double n = Double.parseDouble(values[0]);
        double m = Double.parseDouble(values[1]);
        double k = Double.parseDouble(values[2]);

        return (int) Math.ceil(k*n/m);
    }
}
