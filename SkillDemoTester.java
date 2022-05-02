import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void stringLengthTest() {
        assertEquals(7, SkillDemo.stringLength("science"));
    }
}