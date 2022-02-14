import java.util.ArrayList;

public class MonthData {
    int[] monthDays = new int[30];

    void add(int steps, int numberDay) {
        if (steps > 0) {
            monthDays[numberDay - 1] = steps;
        } else {
            System.out.println("Количество шагов должно быть неотрицательным");
        }
    }

    void print() {
        for (int i = 0; i < monthDays.length; i++) {
            System.out.print(i + 1 + " день: " + monthDays[i] + ", ");
        }
    }

    int findSum() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return sum;
    }

    int findMax() {
        int maxSteps = 0;
        for (int monthDay : monthDays) {
            if (monthDay > maxSteps) {
                maxSteps = monthDay;
            }
        }
        return maxSteps;
    }

    int findAverage() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return (sum / 30);
    }

    int findDistance() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return (sum * 75) / 100000;
    }

    int findKcal() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return (sum * 50) / 1000;
    }

    int findBestseller(int goal) {
        int bestDay = 0;
        int max = 0;
        ArrayList<Integer> bestDays = new ArrayList<>();
        for (int monthDay : monthDays) {
            if (monthDay >= goal) {
                bestDay++;
                bestDays.add(bestDay);
            } else {
                bestDay = 0;
                bestDays.add(bestDay);
            }
        }
        for (int best : bestDays) {
            if (best > max) {
                max = best;
            }
        }
        return max;
    }
}