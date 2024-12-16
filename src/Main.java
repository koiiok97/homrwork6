public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++ ){
            System.out.println("Число: " + i);
        }

        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i-- ){
            System.out.println("Число: " + i);
        }

        System.out.println("\nЗадача 3");
        System.out.println("Чётные числа с 0 по 17:");
        for (int i = 0; i <= 17; i++ ){
            if (i % 2 == 0){
                System.out.println("Число: " + i);
            }
        }

        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i-- ){
            System.out.println("Число: " + i);
        }

        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096 ; i+=4 ){
            System.out.println(i + " год является високосным");
        }

        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98 ; i+=7 ){
            System.out.println("Число: " + i);
        }

        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512 ; i*=2){
            System.out.println("Число: " + i);
        }

        System.out.println("\nЗадача 8");
        int salary = 29000;
        for (int i = 1; i <= 12 ; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ (salary * i) +" рублей");
        }

        System.out.println("\nЗадача 9");
        for (int i = 1; i <= 12 ; i++){
            salary += salary/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ (salary * i) +" рублей");
        }

        System.out.println("\nЗадача 10");
        System.out.println("Таблица умножения на 2:");
        for (int i = 1; i <= 10 ; i++){
            System.out.println("2 * " + i + " = " + ( i * 2 ));
        }
    }
}
