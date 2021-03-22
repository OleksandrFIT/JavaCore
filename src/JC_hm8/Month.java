package JC_hm8;

public enum Month {
    JANUARY(Season.WINTER, 31),
    FEBRUARY(Season.WINTER, 28),
    MARCH(Season.SPRING, 31),
    APRIL(Season.SPRING, 30),
    MAY(Season.SPRING, 31),
    JUNE(Season.SUMMER, 30),
    JULY(Season.SUMMER, 31),
    AUGUST(Season.SUMMER, 31),
    SEPTEMBER(Season.FALL, 30),
    OCTOBER(Season.FALL, 31),
    NOVEMBER(Season.FALL, 30),
    DECEMBER(Season.WINTER, 31);

    Season season;
    int days;

    Month(Season season, int days) {
        this.season = season;
        this.days = days;
    }

    public Season getSeason() {
        return season;
    }

    public int getDays() {
        return days;
    }

    public static Boolean isMonth(Month[] mas, String month){
        Boolean flag= false;

        for (Month m: mas){
            m.name().equals(month);
            System.out.println("Місяць не існує");
            flag = true;
            break;
        }
        return flag;
    }
}
