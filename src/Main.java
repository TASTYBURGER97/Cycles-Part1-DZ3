public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("//Task1");
        int attachment = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += attachment;
            System.out.println("Месяц " + i + "  Сумма накоплений составляет " + sum + " рублей");
        }

        //Task2
        System.out.println("//Task2");
        double percentSum = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            percentSum = (percentSum + attachment) * (1 + percent);
            System.out.println("Месяц " + i + "  Сумма накоплений составляет " + percentSum + " рублей");
        }
    }
}