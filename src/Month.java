public class Month {
    private String name;
    private int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public int getDays() {
        return this.days;
    }

    public String getName() {
        return this.name;
    }
}