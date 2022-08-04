import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
//### **Задание 1**
//Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате, и
// бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
//Напишите четыре строки:
//первая с именем firstName — для хранения имени;
//вторая с именем middleName — для хранения отчества;
//третья с именем lastName — для хранения фамилии;
//четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//Выведите в консоль фразу: “ФИО сотрудника — ….”
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.print("ФИО сотрудника — " + lastName + " " + firstName + " " + middleName + "\n");
//### **Задание 2**
//Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
//Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
//В качестве строки с исходными данными используйте строку fullName.
//Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        System.out.println("Задание 2");
        String fullName = (lastName + " " + firstName + " " + middleName).toUpperCase();
        System.out.print("Данные ФИО сотрудника для заполнения отчета — " + fullName + "\n");
 //### **Задание 3**
//Система, в которой мы работаем, не принимает символ “ё”.
//Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
//В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
//Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович".replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
//        Задание 4
//        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
//        В качестве исходных данных используйте:
//        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
//        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
//        переменная firstName — для хранения имени;
//        переменная middleName — для хранения отчества;
//        переменная lastName — для хранения фамилии.
//                Решите задание с помощью метода substring().
//                Результат программы выведите в формате:
//“Имя сотрудника — …”
//“Фамилия сотрудника — …”
//“Отчество сотрудника — ...”
//Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
        System.out.println("Задание 4");
        fullName = "Ivanov - Ivan - Ivanovich";
        int oneIndex = fullName.indexOf(" - ");
        int twoIndex = fullName.lastIndexOf(" - ");
        firstName = fullName.substring(oneIndex,twoIndex);
        middleName = fullName.substring(0,oneIndex);
        lastName = fullName.substring(twoIndex,fullName.length());
        System.out.println("Имя сотрудника" + firstName);
        System.out.println("Фамилия сотрудника - " + middleName);
        System.out.println("Отчество сотрудника" + lastName);
//Задание 5
//Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
//Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
//В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
//Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        System.out.println("Задание 5");
        String newFullName = "ivanov ivan ivanovich";
        int a = newFullName.indexOf(" ");
        int b = newFullName.lastIndexOf(" ");
        String newFirstName = newFullName.substring(0,1).toUpperCase() + newFullName.substring(1,a).toLowerCase();
        String newMiddleName = newFullName.substring(a+1,a+2).toUpperCase() + newFullName.substring(a+2,b).toLowerCase();
        String newLastName = newFullName.substring(b + 1, b + 2).toUpperCase() + newFullName.substring(b + 2, newFullName.length()).toLowerCase();
        String correctName = (newFirstName + " " + newMiddleName + " " + newLastName);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + correctName);

    }
}