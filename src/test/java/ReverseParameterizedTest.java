import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ReverseParameterizedTest {

    StringHelper stringHelper = new StringHelper();

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "qwerty", "ytrewq" },
                { "asdfgh", "hgfdsa" },
                { "zxcvbn", "nbvcxz" }
        });
    }

    private String expected;
    private String input;

    public ReverseParameterizedTest(String expected, String input){
        this.expected=expected;
        this.input=input;
    }

    @Test
    public void test(){
        assertEquals(expected, stringHelper.reverse(input));
    }
}
