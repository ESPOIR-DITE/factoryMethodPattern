public class EmployeeFactory {

    public Employee getEmployee(String type, int hour)
    {
        if (type.equalsIgnoreCase("bike"))
        {
            return new BikeDriver(hour);


        }
        else
        return new CarDriver(hour);
    }
}
