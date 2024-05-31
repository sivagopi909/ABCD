import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.add;
public class addTest {
    @Test
    public void testAddwithPositiveNumber(){
        int result = add.add(5,6);
        assertEquals(11,result);

    }
    @Test
    public void testAddwithNegativeNumber() {
        int result = add.add(-5, -6);
        assertEquals(-11, result);

    }
    @Test
    public void testAddwithZero() {
        int result = add.add(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void testAddwithOneNegativeNumber() {
        int result = add.add(5, -6);
        assertEquals(-1, result);
    }
}
