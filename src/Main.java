import java.time.LocalDate;

public class Main {
    //Task1
    public static void isYearLaep(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
    }

    //Task2
    public static void installOSVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear < currentYear)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    //Task3
    public static void deliverySpeed(int deliveryDistance) {
        int distanse1 = 20;
        int time1 = 1;
        int distanse2 = 60;
        int time2 = 2;
        int distanse3 = 100;
        int time3 = 3;
        if (deliveryDistance <= distanse1) System.out.println("Потребуется дней " + time1);
        else if (deliveryDistance <= distanse2) System.out.println("Потребуется дней " + time2);
        else if (deliveryDistance <= distanse3) System.out.println("Потребуется дней " + time3);
        else System.out.println("Вы слишком далеко живёте. Мы не сможем доставить вам карту");
    }

    //второй вариант
    public static int deliverySpeed2(int deliveryDistance) {
        int distanse1 = 20;
        int time1 = 1;
        int distanse2 = 60;
        int time2 = 2;
        int distanse3 = 100;
        int time3 = 3;
        if (deliveryDistance <= distanse1) return time1;
        else if (deliveryDistance <= distanse2) return time2;
        else if (deliveryDistance <= distanse3) return time3;
        else return 0;
    }

    public static void main(String[] args) {
        //Task1
        int year = 2021;
        isYearLaep(year);

        //Task2
        int clientOS = 1;
        int clientDeviceYear = 2020;
        installOSVersion(clientOS, clientDeviceYear);

        //Task3
        int deliveryDistance = 95;
        deliverySpeed(deliveryDistance);

        //второй вариант
        int time = deliverySpeed2(deliveryDistance);
        if (time == 0) {
            System.out.println("Вы слишком далеко живёте. Мы не сможем доставить вам карту");
        } else System.out.println("Потребуется дней " + time);

    }
}