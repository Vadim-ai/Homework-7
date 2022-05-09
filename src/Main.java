import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;

import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        //Lesson 7 Task 1
        {  String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Lesson 7 Task 2
        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        //Lesson 7 Task 3
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
        //Lesson 7 Task 5 (Task 4 - нету в условиях)



            String fullName = "ivanov ivan ivanovich";

            String s1 = fullName.substring(0, fullName.indexOf(" "));
            String s2 = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
            String s3 = fullName.substring(fullName.lastIndexOf(" ") + 1);

            System.out.println("Фамилия сотрудника — " + s1);
            System.out.println("Имя сотрудника — " + s2);
            System.out.println("Отчество сотрудника — " + s3);

        //Task 6

        char[] example = fullName.toCharArray();
        char x= ' ';
        example[0] = toUpperCase(example[0]);

        //example[fullName.indexOf(" ") + 1] = toUpperCase (example[fullName.indexOf(" ") + 1]); тестирование

       for (int i = 0; i < example.length; i++) {
           if (example[i] == x) {
               example[i + 1] = toUpperCase(example[i + 1]);
           }
           System.out.print(example[i]);
       }
        System.out.println();

        //Task 7
        String z = "135";
        String w = "246";

        char[] unicorns = z.toCharArray();
        char[] kapits = w.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < z.length(); i++) {
            sb.append(unicorns[i]);
            sb.append(kapits[i]);
        }
        System.out.println(sb);

        //Task 8
        String letters = "aabccddefgghiijjkk";
        StringBuilder wow = new StringBuilder();
        char[] lebrons = letters.toCharArray();
        for (int i = 0; i < lebrons.length - 1; i++) {
            if (lebrons[i] == lebrons[i + 1]) {
                wow.append(lebrons[i]);
        }
        }
        System.out.println(wow);


    }



    }


