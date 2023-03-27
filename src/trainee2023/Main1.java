package trainee2023;


// Четыре человека выстроились в очередь друг за дургом. Определите, правда ли, что они стоят ро росту
// (не важно, в порядке неубывания или порядке невозрастания).

// Выведите  YES, если люди выстроены в порядке неубывания или невозростания их роста, и NO в противном случае.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
//        int[] people = new int[]{3, 5, 8, 10};
//        int[] people = new int[]{3, 5, 8, 7};
//        int[] people = new int[]{13, 5, 1, 1};
//        int[] people = new int[]{13, 5, 8, 7};

//        String human = "3,5,8,10";
//        String human = "3,5,8,7";
//        String human = "13,5,1,1";
//        String human = "13,5,8,7";

//        System.out.println(isSortPeopleStr(human));
//        System.out.println(isSortPeople(people));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String values = reader.readLine();
        System.out.println(isSortPeopleStr(values));
    }

    public static String isSortPeopleStr(String values){
        String[] people = values.split(" ");

        for (int i = 0; i < people.length-1; i++) {
            if (Integer.parseInt(people[i]) <= Integer.parseInt(people[i+1])) {
                if (i == people.length-2){
                    return "YES";
                }
            }
            else break;
        }
        for (int i = 0; i < people.length-1; i++) {
            if (Integer.parseInt(people[i]) >= Integer.parseInt(people[i+1])) {
                if (i == people.length-2){
                    return "YES";
                }
            }
            else break;
        }
        return "NO";
    }
}
