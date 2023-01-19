public class Main {
    public static void main(String[] args) {
        // 1 and 2 task
        boolean clientOS = true;
        int yearOfPhone = 2015;
        if (clientOS && yearOfPhone >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS && yearOfPhone < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS == false && yearOfPhone >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == false && yearOfPhone < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // 3 task
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " год является високосным");
        } else {
            System.out.println(year+ " год не является високосным");
        }
        //task 4
        int distance1 = 20;
        int distance2 = 60;
        int distance3 = 100;
        int deliveryDistance = 130;
        int day = 0;
        if (deliveryDistance <= 20){
            day = day + 1;
            System.out.println(day + " день срок доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            day = day + 2;
            System.out.println(day + " дня срок доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            day = day + 3;
            System.out.println( day + " дня срок доставки");
        } else{
            System.out.println("К сожалению, не доставляем!");
        }
        //task 5
        int month = 11;
        switch (month){
            case 1 :
                System.out.println("зима");
                break;
            case 2 :
                System.out.println("зима");
                break;
            case 3 :
                System.out.println("весна");
                break;
            case 4 :
                System.out.println("весна");
                break;
            case 5 :
                System.out.println("весна");
                break;
            case 6 :
                System.out.println("лето");
                break;
            case 7 :
                System.out.println("лето");
                break;
            case 8 :
                System.out.println("лето");
                break;
            case 9 :
                System.out.println("осень");
                break;
            case 10 :
                System.out.println("осень");
                break;
            case 11 :
                System.out.println("осень");
                break;
            case 12 :
                System.out.println("зима");
                break;
            default:
                System.out.println("вы ошиблись");
        }
    }
}