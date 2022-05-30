import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();

    @Test
    public void generate() {
        int stringLength = 10;
        int expected = 10;
        int actual = stringHelper.generate(stringLength).length();
        assertEquals(expected, actual);
    }

    @Test
    public void reverse() {
        String str = "qwerty";
        String expected = "ytrewq";
        String actual = stringHelper.reverse(str);
        assertEquals(expected, actual);
    }

    @Test
    public void format() {
        String args [] = {"This {1} is {2}.", "string", "formatted"};
        String expected = "This string is formatted.";
        String actual = stringHelper.format(args);
        assertEquals(expected, actual);
    }

    @Test
    public void camelCase() {
        String strInput = "hello WORLD!";
        String expected = "HeLlO WoRlD!";
        String actual = stringHelper.camelCase(strInput);
        assertEquals(expected, actual);
    }
}