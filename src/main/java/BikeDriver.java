public class BikeDriver implements Employee {

    int s;

    public BikeDriver() {
    }

    public BikeDriver(int s) {
        this.s = s;
    }

    public int weekSalary() {
        return s*25;
    }
}
