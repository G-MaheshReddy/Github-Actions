import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void testAdd() {
        Addition a = new Addition();
        assertEquals(15, a.add(5, 10));
        assertEquals(0, a.add(-5, 5));
        assertEquals(-10, a.add(-5, -5));
    }
}
