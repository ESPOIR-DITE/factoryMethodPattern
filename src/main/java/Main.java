public class Main {
    public static void main(String[] args) {
        EmployeeFactory an = new EmployeeFactory();
        Employee employee =an.getEmployee("bik",50);
        System.out.println(""+employee.weekSalary());
    }
}
