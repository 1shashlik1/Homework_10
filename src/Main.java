public class Main {
    public static void main(String[] args) {
        //Задача№1
        System.out.println("Задача№1: Ответ.");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + ' ' + firstName + ' ' + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        //Задача№2
        System.out.println("Задача№2: Ответ");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
        //Задача№3
        System.out.println("Задача№3: Ответ");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'e');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);
    }


}