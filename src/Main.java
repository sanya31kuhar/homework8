public class Main {

    public static void main(String[] args) {

	    // task 1
        String firstName = "Ivan";
        String middleName ="Ivanovich";
        String lastName ="Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2
        fullName = "Ivanov Ivan Ivanovich";
        String fullNames = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNames);

        // task 3
        fullName = "Иванов Семён Семёнович";
        fullName=fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}
