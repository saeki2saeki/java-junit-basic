package ex3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Ex3Test {
    /**
     * 例題3
     * 与えられた数列から最も小さな数字を選んでください。
     *
     * 入力例: 100, 20, 5, 1, 200, 5
     * 出力例: 1
     *
     * assertThat と is を使って、適切なテストも作ってください。
     */
    @Test
    public void testMin() throws Exception {
        Ex3 ex3 = new Ex3();
        assertThat(ex3.min(100, 20, 5, 1, 200, 5), is(1));
    }
}