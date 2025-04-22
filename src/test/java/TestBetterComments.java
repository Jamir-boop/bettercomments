import com.automationanywhere.botcommand.BetterComments;
import com.automationanywhere.botcommand.data.model.image.Image;
import org.testng.annotations.Test;

public class TestBetterComments {
    @Test
    public void TestBetterCommentsDetails() {
        String firstString = "hello world!";
        Image mockImage = new Image("some/path/to/image.png", "some/path/to/thumbnail.png");

        BetterComments testBC = new BetterComments();
        testBC.action(firstString, firstString, mockImage);
    }
}
