package ex1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Ex1Test {

    /**
     * 例題1
     * 与えられた数列を合計してください。
     *
     * 入力例: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * 出力例: 55
     */
    @Test
    public void testSum() throws Exception {
        Ex1 ex1 = new Ex1();
        assertThat(ex1.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), is(55));
    }
}