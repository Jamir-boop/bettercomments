import com.automationanywhere.botcommand.BetterComments;
import com.automationanywhere.botcommand.data.model.image.Image;
import com.automationanywhere.botcommand.data.Value; // Import Value
import com.automationanywhere.botcommand.data.impl.StringValue; // Import StringValue
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestBetterComments {
    @Test
    public void TestBetterCommentsDetails() {
        String firstString = "hello world!";
        String codeBlockString = "System.out.println('Hello World');";
        Image mockImage = new Image("some/path/to/image.png", "some/path/to/thumbnail.png");

        // Create a mock aboutDescription (HTML field expects Map<String, Value>)
        Map<String, Value> aboutDescription = new HashMap<>();
        aboutDescription.put("description", new StringValue("<b>Bold description</b>"));

        BetterComments testBC = new BetterComments();
        testBC.action(firstString, aboutDescription, codeBlockString, mockImage);
    }
}
