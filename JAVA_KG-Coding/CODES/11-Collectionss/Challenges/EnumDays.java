package _12Collectionss.Challenges;

public enum EnumDays {
    MONDAY("Weekday"), TUESDAY("Weekday"),
    WEDNESDAY("Weekday"), THURSDAY("Weekday"),
    FRIDAY("Weekday"), SATURDAY("Weekend"),
    SUNDAY("Weekend");
    private final String isDayOrEnd;

    EnumDays(String isDayOrEnd) {
        this.isDayOrEnd = isDayOrEnd;
    }

    String getIsDayOrEnd(){
        return isDayOrEnd;
    }
    public static void main(String[] args) {
        EnumDays days=EnumDays.SATURDAY;
        for (EnumDays day : EnumDays.values()) {
            System.out.print(day+" : ");
            System.out.println(day.getIsDayOrEnd());
        }
        System.out.println(days+" : "+days.isDayOrEnd);
    }
}
