public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задачи на циклы ч1
        //Задача1
        System.out.println("Задача1");
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача2
        System.out.println("Задача2");
        for (int i=10; i>=0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача3
        System.out.println("Задача3");
        for (int i=0; i<=17; i++) {
            if (i%2==0 && i!=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Задача4
        System.out.println("Задача4");
        for (int i=10; i>=-10; i--) {
            if (i>(i-1)) {
                System.out.print(i + " ");
            }
            else {
                System.out.print((i-1) + " ");
                i--;
            }
        }
        System.out.println();
        //Задача5
        System.out.println("Задача5");
        for (int i=1904; i<=2096; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Задача6
        System.out.println("Задача6");
        for (int i=7; i<=100; i=i+7) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача7
        System.out.println("Задача7");
        for (int i=2; i<=512; i=i*2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача8
        System.out.println("Задача8");
        int investments = 0;
        for (int i=1; i<=12; i++) {
            investments = investments+29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + investments + " рублей");
        }
        System.out.println();
        //Задача9
        System.out.println("Задача9");
        double investmentsComplex = 0;
        String result;
        for (int i=1; i<=12; i++) {
            investmentsComplex = (investmentsComplex+29000)*1.01;
            result = String.format("%.3f",investmentsComplex);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
        }
        System.out.println();
        //Задача10
        System.out.println("Задача10");
        for (int i=1; i<10; i++) {
            System.out.println("2 * "+i+" = "+(i*2));
        }
        System.out.println();
    }
}