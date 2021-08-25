import management.Manager;
import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Stephen", 5, 100000);
    }
    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(101000, developer.getSalary(), 0.1);
    }
    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(1000, developer.payBonus(), 0.1);
    }
}
