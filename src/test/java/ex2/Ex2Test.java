package ex2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Ex2Test {
    /**
     * 例題2
     * 与えられた文字列を反対にしてください。
     *
     * 入力例: string
     * 出力例: gnirts
     */
    @Test
    public void testReverse() throws Exception {
        Ex2 ex2 = new Ex2();
        assertThat(ex2.reverse("string"), is("gnirts"));
    }
}