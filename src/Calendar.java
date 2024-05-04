import java.util.ArrayList;

public class Calendar {
    private int currentYear;
    private Month currentMonth;
    private int currentDay;

    public Calendar(String month, int year) {
        constructNewYear(month, year);
    }

    private constructNewYear(String month, int year) {
        this.currentYear = year;
        Month January = new Month(January, 31);
        if(this.currentYear % 4 == 0) {
            Month February = new Month(February, 28);
        } else {
            Month February = new Month(February, 29);
        }
        Month March = new Month(March, 31);
        Month April = new Month(April, 30);
        Month May = new Month(May, 31);
        Month June = new Month(June, 30);
        Month July = new Month(July, 31);
        Month August = new Month(August, 31);
        Month September = new Month(September, 30);
        Month October = new Month(October, 31);
        Month November = new Month(November, 30);
        Month December = new Month (December, 31);

        private ArrayList<Month> months = new ArrayList<>();
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

        this.currrentMonth = month;
        this.currentDay = 1;
    }

    public updateDate() {
        if(currentDay != currentMonth.getDays()) {
            currentDay++;
        } else if(!currentMonth.getName().equals("December")) {
            currentMonth = months(months.indexOf(this.currentMonth) + 1);
        } else {
            constructNewYear(January, this.currentYear + 1);
        }
    }

    public String getMonth() {
        return this.currentMonth;
    }

    public int getDay() {
        return this.currentDay;
    }
}