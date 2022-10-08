public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    private static void task5() {
        //Задание 5
        /**
         * Программа, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит
         */
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлижит к сезону - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлижит к сезону - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлижит к сезону - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлижит к сезону - осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }

    private static void task4() {
        //Задание 4
        /**
         * Программа, которая выдает сообщение в консоль:
         * "Потребуется дней: " + срок доставки
         */
        int deliveryDistance = 75;
        int deliveryDay = 1;
        int i = deliveryDay + 1;
        int b = ++i;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + i);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + b);
        }

    }

    private static void task3() {
        //Задание 3
        /**
         * Программа должна определять, високосный год или нет
         */
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task2() {
        //Задание 2
        /**
         * Написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий
         * — операционной системы телефона (iOS или Android) и года производства.
         */
        int clientDeviceYear = 2022;
        int clientOs = 0;
        int iOS = 0;
        int android = 1;
        if (clientOs == iOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == iOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    private static void task1() {
        //Задание 1
        /**
         * Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
         * и выдает соответствующее сообщение для обоих вариантов.
         */
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}