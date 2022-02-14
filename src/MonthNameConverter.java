public class MonthNameConverter {
    int number;

    int convert(String month) {
        switch (month) {
            case "Январь":
                number = 1;
                break;
            case "Февраль":
                number = 2;
                break;
            case "март":
                number = 3;
                break;
            case "Апрель":
                number = 4;
                break;
            case "Май":
                number = 5;
                break;
            case "Июнь":
                number = 6;
                break;
            case "Июль":
                number = 7;
                break;
            case "Август":
                number = 8;
                break;
            case "сентябрь":
                number = 9;
                break;
            case "Октябрь":
                number = 10;
                break;
            case "Ноябрь":
                number = 11;
                break;
            case "Декабрь":
                number = 12;
                break;
            default:
                System.out.println("Извините, такого месяца нет.");
                break;
        }
        return number;
    }
}