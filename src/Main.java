public class Main{
    public static void main(String[] args){
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");


        }

        int clientDeviceYear = 2000;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        int year = 3000;
        int pearYear = year % 4;
        int pearYear2 = year % 400;
        int year2 = year % 100;


        if (pearYear2 == 0) {
            System.out.println(year + " год является високосным");
        } else if (pearYear == 0) {
            System.out.println(year + " год является високосным");
        } else if (year2 == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 70;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка невозможна");
        }

        int monthNumber = 5;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }

}



