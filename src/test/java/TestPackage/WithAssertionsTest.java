package TestPackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class WithAssertionsTest {
    @Test
    public void firstAssertion(){
        assertEquals(2,2);
    }

    public void secondAssertion(){
        assertEquals(45,45);
    }

}
