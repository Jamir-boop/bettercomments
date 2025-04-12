import com.automationanywhere.botcommand.BetterComments;
import org.testng.annotations.Test;

public class TestBetterComments {
    @Test
    public void TestBetterCommentsDetails() {
        String firstString = "hello world!";

        BetterComments testBC = new BetterComments();
        testBC.action(firstString, firstString, firstString);

    }
}
