import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Lesson 7 Task 1
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Lesson 7 Task 2
        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        //Lesson 7 Task 3
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}