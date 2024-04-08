import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    String message = "Hello world";
    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, "Hello world");
    }
    public static void main(String[] args) {
        AppTest result = new AppTest();
        result.testPrintMessage();
    }
}
