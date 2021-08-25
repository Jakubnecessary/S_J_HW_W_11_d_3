import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Stephen", 5, 100000, "Hell", 5);
    }
    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000);
        assertEquals(101000, director.getSalary(), 0.1);
    }
    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(1000, director.payBonus(), 0.1);
    }
}
