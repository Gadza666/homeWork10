import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Task 1");
        printIsLeapYear(2003);

        System.out.println("Task 2");
        int currentYear = LocalDate.now().getYear();
        printValidTypeInfo(1, 2000);

        System.out.println("Task 3");
        calculateDeliveryDays(67);
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
        if (type == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (type == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (type == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day++;
            System.out.println("Потребуется " + day + " день что бы доставить груз на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            day += 2;
            System.out.println("Потребуется " + day + " дня для доставки на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day += 3;
            System.out.println("Потребуется " + day + " дня для доставки на " + deliveryDistance + " км.");
        } else {
            System.out.println("Доставка нет на " + deliveryDistance + " км. слишком большое расстояние");
        }
        return day;
    }

}
