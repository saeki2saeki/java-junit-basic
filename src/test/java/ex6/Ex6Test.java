package ex6;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Ex6Test {
    /**
     * 例題6
     * 数列が文字列で与えられます。それぞれの数字の出現数を表す文字列を作ってください。
     *
     * 入力例: "1 3 5 3 7 3 1 1 5"
     * 出力例: "1(3) 3(3) 5(2) 7(1)"
     *
     * assertThat と is を使って、適切なテストを作ってください。
     */
    @Test
    public void testCount() throws Exception {
    	Ex6 ex6 = new Ex6();
    	assertThat(ex6.count("1 3 5 3 7 3 1 1 5"), is("1(3) 3(3) 5(2) 7(1)") );
    }
}