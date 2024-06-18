import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Task 1");
        printIsLeapYear(2002);

        System.out.println("Task 2");
        int currentYear = LocalDate.now().getYear();
        printValidTypeInfo(1, 2000);

        System.out.println("Task 3");
        System.out.println("Потребуется дней:" + calculateDeliveryDays(33));


    }

    public static void printIsLeapYear(int year) {
        if (year < 1584) {
            System.out.println("Високосный год еще не придумали");
        } else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void printValidTypeInfo(int type, int year) {
        if (type == 0 && year >= 2024) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (type == 0 && year < 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year >= 2024) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (type == 1 && year < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day++;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day += 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day += 3;
        }
        if (deliveryDistance > 100) {
            return -1;
        }
        return day;
    }
}

