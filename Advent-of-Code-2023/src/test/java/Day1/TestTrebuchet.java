package Day1;



import org.example.Day1.Trebuchet;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestTrebuchet {
    @Test
    public void TestgetLaunchCode() {
        Trebuchet t = new Trebuchet();
        assertEquals(t.getLaunchCode("src/test/java/Day1/testValue.txt"), 110);
   }

   @Test
    public void TestgetLaunchCodeV2() {
        Trebuchet t = new Trebuchet();
        assertEquals(t.getLaunchCodeV2("src/test/java/Day1/testValue2.txt"), 28);
   }
}

