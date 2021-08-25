import management.Manager;
import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Stephen", 5, 100000);
    }
    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(101000, databaseAdmin.getSalary(), 0.1);
    }
    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(1000, databaseAdmin.payBonus(), 0.1);
    }
}
