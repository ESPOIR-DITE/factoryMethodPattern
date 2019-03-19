public class CarDriver implements Employee {
    private int hours;

    public CarDriver(int hours) {
        this.hours = hours;
    }

    public int weekSalary() {
        return hours*30;
    }
}
