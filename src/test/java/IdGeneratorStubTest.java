import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdGeneratorStubTest {

    StringHelper stringHelper = new StringHelper(){
        @Override
        public String generate(int idLength){
            return "qwerty";
        }
    };

    IdGenerator idGenerator = new IdGenerator(stringHelper);

    @Test
    public void generateId() {

        int idLength = 6;
        assertEquals("qwerty", idGenerator.generateId(idLength));
    }
}