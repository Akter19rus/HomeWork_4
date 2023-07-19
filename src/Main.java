public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //int age = 17;
        int age = 1 + (int) (Math.random() * 30);
        System.out.println("Если человеку " + age + " то");
        if (age >= 18) {
            System.out.println(" Человек совершеннолетний!");
        } else {
            System.out.println(" Человек еще не совершеннолетний!");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        //int temperature = 5;
        int temperature = (int) (Math.random() * (40 + 1)) - 20;
        System.out.println("Если на улице температура " + temperature);
        if (temperature < 5) {
            System.out.println(" то на улице холодно, нужно надеть шапку!");
        } else {
            System.out.println(" то сегодня тепло, шапку можно не надевать!");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        //int speed = 60;
        int speed = 1 + (int) (Math.random() * 180);
        System.out.println("Если скорость " + speed + " км/ч, то");
        boolean speedAllowed = speed > 60;
        if (speedAllowed) {
            System.out.println(" придется заплатить штраф!");
        } else {
            System.out.println(" Можно ездить спокойно!");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        //int age = 60;
        int age = 1 + (int) (Math.random() * 80);
        System.out.println("Если возраст человека равен " + age);
        if (age < 2) {
            System.out.println(" то ему пора спать!");
        } else if (age >= 2 && age <= 6) {
            System.out.println(" то ему нужно ходить в детский сад!");
        } else if (age >= 7 && age < 18) {
            System.out.println(" то ему нужно ходить в школу!");
        } else if (age >= 18 && age < 24) {
            System.out.println(" то его место в университете!");
        } else if (age >= 24 && age < 60) {
            System.out.println(" то ему пора ходить на работу!");
        } else {
            System.out.println(" то он может отдохнуть!");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        //int ageChild = 8;
        int ageChild = 1 + (int) (Math.random() * 18);
        System.out.println("Если возраст ребенка равен " + ageChild);
        if (ageChild < 5) {
            System.out.println(" то он не может кататься на аттракционе!");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println(" то он может кататься ТОЛЬКО в сопровождении взрослого");
        } else {
            System.out.println(" то он может кататься без сопровождения взрослого :)");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        //int myPlace = 103;
        int myPlace = 1 + (int) (Math.random() * 110);
        System.out.println("Вы в очереди по счету " + myPlace + " человек");
        if (myPlace <= 60) {
            System.out.println(" Вам повезло, вы попали на сидячее место");
        } else if (myPlace > 60 && myPlace <= 102) {
            System.out.println(" Вам повезло, вы поедете, но только стоя");
        } else {
            System.out.println("Увы, вам не хватило место в вагоне :(");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        //int numberOne = 500;
        //int numberTwo = 800;
        //int numberThree = 300;
        int numberOne = (int) (Math.random() * 999);
        int numberTwo = (int) (Math.random() * 999);
        int numberThree = (int) (Math.random() * 999);
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Число " + numberOne + " больше, чем числа " + numberTwo + " и " + numberThree);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Число " + numberTwo + " больше, чем числа " + numberOne + " и " + numberThree);
        } else {
            System.out.println("Число " + numberThree + " больше, чем числа " + numberOne + " и " + numberTwo);
        }

    }
}