import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Stephen", 5, 100000, "Hell");
    }
    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(101000, manager.getSalary(), 0.1);
    }
    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(1000, manager.payBonus(), 0.1);
    }
}
