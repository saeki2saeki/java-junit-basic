package ex0;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void testSum() throws Exception {
        Math math = new Math();
        assertThat(math.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), is(55));
    }
}