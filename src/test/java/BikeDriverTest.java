import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeDriverTest {
    BikeDriver bikeDriver = new BikeDriver(2);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void weekSalary() {
        //bikeDriver=new BikeDriver(2);
        int x=bikeDriver.weekSalary();

        Assert.assertEquals(5,x );
    }
}