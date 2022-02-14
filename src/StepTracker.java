import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<>();
    int goal = 10000;

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    void saveDayData(int nameMonth, int steps, int numberDay) {
        MonthData result = monthToData.get(nameMonth - 1);
        result.add(numberDay, steps);
    }

    void printDataMonth(int nameMonth) {
        MonthData result = monthToData.get(nameMonth - 1);
        result.print();
        System.out.println(" ");
        System.out.println("Общее количество шагов за месяц:" + result.findSum());
        System.out.println("Максимальное пройденное количество шагов в месяце:" + result.findMax());
        System.out.println("Среднее количество шагов за месяц:" + result.findAverage());
        System.out.println("Пройденная дистанция (в км) за месяц:" + result.findDistance());
        System.out.println("Общее количество сожжённых килокалорий:" + result.findKcal());
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого:" + result.findBestseller(goal));
    }

    void changeGoal(int target) {
        if (target > 0) {
            goal = target;
            System.out.println("Новая цель по количеству шагов в день сохранена");
        } else {
            System.out.println("Количество шагов должно быть неотрицательным");
        }
    }
}