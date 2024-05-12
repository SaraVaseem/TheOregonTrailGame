import java.util.ArrayList;

public class Calendar {
    private int currentYear;
    private String currentMonth;
    private int currentDay;
    public ArrayList<Month> months = new ArrayList<Month>();

    public Calendar(String month, int year) {
        constructNewYear(month, year);
    }

    public void constructNewYear(String month, int year) {
        this.currentYear = year;
        Month January = new Month("January", 31);
        int febDays = 28;
        if(this.currentYear % 4 == 0) {
            febDays++;
        }
        Month February = new Month("February", febDays);
        Month March = new Month("March", 31);
        Month April = new Month("April", 30);
        Month May = new Month("May", 31);
        Month June = new Month("June", 30);
        Month July = new Month("July", 31);
        Month August = new Month("August", 31);
        Month September = new Month("September", 30);
        Month October = new Month("October", 31);
        Month November = new Month("November", 30);
        Month December = new Month ("December", 31);

        months.add(January);
        months.add(February);
        months.add(March);
        months.add(April);
        months.add(May);
        months.add(June);
        months.add(July);
        months.add(August);
        months.add(September);
        months.add(October);
        months.add(November);
        months.add(December);

        this.currentMonth = month;
        this.currentDay = 1;
    }

    public void updateDate() {
        if(currentDay != months.get(months.indexOf(currentMonth)).getDays()) {
            currentDay++;
        } else if(!currentMonth.equals("December")) {
            currentMonth = months.get(months.indexOf(currentMonth) + 1).getName();
        } else {
            constructNewYear("January", this.currentYear + 1);
        }
    }

    public int getYear() {
        return this.currentYear;
    }

    public String getMonth() {
        return this.currentMonth;
    }

    public int getDay() {
        return this.currentDay;
    }
}