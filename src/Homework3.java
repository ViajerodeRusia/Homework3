import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Задачи на циклы ч2
        //Задача1
        System.out.println("Задача1");
        double investmentsComplex = 0;
        int target = 2459000;
        String result;
        int i = 0;
        while (investmentsComplex < target) {
            investmentsComplex = (investmentsComplex + 29000) * 1.01;
            i++;
        }
        result = String.format("%.3f", investmentsComplex);
        System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
        System.out.println();

        //Задача2
        System.out.println("Задача2");
        int j=1;
        while (j<=10) {
            System.out.print(j+" ");
            j++;
        }
        j--;
        System.out.println();
        for (; j>=1;j--) {
            System.out.print(j+" ");
        }
        System.out.println();

        //Задача3
        System.out.println();
        System.out.println("Задача3");
        int population = 12000000;
        int birthRate = population/1000*17;
        int deathRate = population/1000*8;
        i=0;
        for(; i<=10;i++) {
            population = population-deathRate+birthRate;
            System.out.println("Год " +i+", численность населения составляет "+population);
        }
        System.out.println();

        //Задача4
        System.out.println("Задача4");
        investmentsComplex = 0;
        target = 12000000;
        i = 0;
        while (investmentsComplex < target) {
            i++;
            investmentsComplex = (investmentsComplex + 15000) * 1.07;
            result = String.format("%.3f", investmentsComplex);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
        }
        System.out.println();

        //Задача5
        System.out.println("Задача5");
        investmentsComplex = 0;
        i = 0;
        while (investmentsComplex < target) {
            i++;
            investmentsComplex = (investmentsComplex + 15000) * 1.07;
            if (i%6==0 && i!=0) {
                result = String.format("%.3f", investmentsComplex);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
            }
        }
        System.out.println();

        //Задача6
        System.out.println("Задача6");
        investmentsComplex = 0;
        int period = 9*12;
        for (i = 1; i<=period; i++) {
            investmentsComplex = (investmentsComplex + 15000) * 1.07;
            if (i%6==0) {
                result = String.format("%.3f", investmentsComplex);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
            }
        }
        System.out.println();

        //Задача7
        System.out.println("Задача7");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число первой пятницы (1-7)");
        int fridayFirst = in.nextInt();
        System.out.println("Введите число месяца (1-31)");
        int today = in.nextInt();

        int friday = fridayFirst;
        /*
         Прибавляем к каждому по 7, пока<31.
         Если today = одному из этих дней, то пишем напоминание об отчете.
         При этом должно получиться еще 4-5 сообщений с напоминаниями по разным датам пятниц.
        */
        do {
            System.out.println("Пятница,"+ friday + "-е число. Необходимо подготовить отчет.");
            if (today==friday) {
                System.out.println("(Кстати, сегодня пятница,"+ today + "-е число. Подготовьте отчет)");
            }
            friday+=7;
        }
        while (friday<=31);
        System.out.println();

        //Задача8
        System.out.println("Задача8");
        System.out.println("Введите год");
        int thisYear = in.nextInt();
        System.out.println();
        /*
         Комета пролетает каждый 79й год
         Надо вывести все ее пролеты над землей за последние 200 лет
         Надо вывести следующий год пролета кометы (ближайшие 100 лет)
        */
        for (i = (thisYear-200);i <= (thisYear+100); i++) {
            if (i % 79 == 0 && i<=thisYear) {
                System.out.println("Прошлый пролет кометы: "+i);
                i+=78;
            }
            if (i % 79 == 0) {
                System.out.println("Будущий пролет кометы: "+i);
                i+=78;
            }
        }
    }
}
