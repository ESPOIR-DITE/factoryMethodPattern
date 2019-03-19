import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDriverTest {

    CarDriver carDriver= new CarDriver(3);
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void weekSalary() {
        int x=carDriver.weekSalary();

        Assert.assertEquals(90,x );
    }
}