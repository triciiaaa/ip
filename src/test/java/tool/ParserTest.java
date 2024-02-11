package tool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    public void userInputDateTimeFormat_success() {
        String userInput = "2024-02-16 18:00";

        String expectedOutput = "16 Feb 2024 18:00";
        String actualOutput = Parser.formatDateTime(userInput);

        assertEquals(expectedOutput, actualOutput);
    }
}