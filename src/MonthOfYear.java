package src;


public enum MonthOfYear {
	JANUARY(31), FEBRUARY(28),  MARCH(31),
    APRIL(30),   MAY(31),       JUNE(30),
    JULY(31),    AUGUST(31),    SEPTEMBER(30),
    OCTOBER(31), NOVEMBER(30),  DECEMBER(31);
	
	private final int amountOfDays;

    private MonthOfYear(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }
    
    private boolean isBissextile(final int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    
    public int getAmountofDays(final int year) {
        if (this == FEBRUARY && isBissextile(year)) {
            return 29;
        }
        return amountOfDays;
    }

    public MonthOfYear getNextMonth() {
        int monthCount = values().length;
        return values()[(this.ordinal() + monthCount + 1) % monthCount];
    }
}
