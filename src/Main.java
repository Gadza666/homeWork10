import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Task 1");

        printIsLeapYear(2000);

        System.out.println("Task 2");

        int currentYear = LocalDate.now().getYear();
        printValidTypeInfo(0,currentYear );

        System.out.println("Task 3");

        int deliveryDistance = 111;
        System.out.println(" Потребуется дней: " + intcalculateDeliveryDays(deliveryDistance));


    }

    public static void printIsLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    public static void printValidTypeInfo(int type, int year) {
        if (type == 0 && year >= 2024) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (type == 0 && year < 2024) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year >= 2024) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (type == 1 && year < 2024) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }
    }

    public static String intcalculateDeliveryDays(int distance) {
        String day = "";
        if (distance < 20) {
            day = "1";
        } else if (distance >= 20 && distance < 60) {
            day = "2";
        } else if (distance >= 60 && distance < 100) {
            day = "3";
        } else {
            day = " Свыше 100 км доставки нет ";
        }
        return day;
    }
}
