import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        MonthNameConverter monthNameConverter = new MonthNameConverter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите название месяца :");
                String month = scanner.next();
                int nameMonth = monthNameConverter.convert(month);
                System.out.println("Введите номер дня :");
                int numberDay = scanner.nextInt();
                System.out.println("Введите количество шагов, пройденных в этот день :");
                int steps = scanner.nextInt();
                stepTracker.saveDayData(nameMonth, numberDay, steps);
            } else if (command == 2) {
                System.out.println("Введите название месяца, за который требуется статистика :");
                String month = scanner.next();
                int nameMonth = monthNameConverter.convert(month);
                stepTracker.printDataMonth(nameMonth);
            } else if (command == 3) {
                System.out.println("Укажите цель по количеству шагов в день :");
                int target = scanner.nextInt();
                stepTracker.changeGoal(target);
            } else if (command == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}