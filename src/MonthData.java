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

    int sum() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return sum;
    }

    int findmax() {
        int maxSteps = 0;
        for (int monthDay : monthDays) {
            if (monthDay > maxSteps) {
                maxSteps = monthDay;
            }
        }

        return maxSteps;
    }

    int average() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return (sum / 30);

    }

    int distance() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return ((sum * 75) / 100000);

    }

    int kKal() {
        int sum = 0;
        for (int monthDay : monthDays) {
            sum += monthDay;
        }
        return ((sum * 50) / 1000);

    }

    int bestseries(int goal) {
        int bestday = 0;
        int max = 0;
        ArrayList<Integer> bestDays = new ArrayList<>();
        for (int monthDay : monthDays) {
            if (monthDay >= goal) {
                bestday++;
                bestDays.add(bestday);


            } else {
                bestday = 0;
                bestDays.add(bestday);
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


