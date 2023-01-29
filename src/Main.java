public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String phone = "920-060 77 88";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79200607788";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
    }

    public static void task4() {
        System.out.println("Задача 4");
        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);
    }
}

