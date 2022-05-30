import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepositoryTest {

    Repository repository = new Repository();

/*
    @Test
    public void save() {
        assertEquals(expected, repository.save("123"));
    }
*/

    @Test(expected = EmptyObjectException.class)
    public void EmptyObjectException() {
        repository.save(null);
    }
}