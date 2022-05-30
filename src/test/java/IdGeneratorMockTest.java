import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IdGeneratorMockTest {

    @Mock
    StringHelper mockedStringHelper;

    @Test
    public void generateId(){

        IdGenerator idGenerator = new IdGenerator(mockedStringHelper);

        Mockito.when(mockedStringHelper.generate(6)).thenReturn("qwerty");
        assertEquals("qwerty", idGenerator.generateId(6));
    }
}
