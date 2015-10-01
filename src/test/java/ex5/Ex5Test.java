package ex5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Ex5Test {
    /**
     * 例題5
     * 与えられた数列から、重複していない数字のリストを作ってください。
     *
     * 入力例: 1, 3, 5, 3, 7, 3, 1, 1, 5
     * 出力例: [1, 3, 5, 7]
     *
     * assertThat と is を使って、適切なテストも作ってください。
     */
    @Test
    public void testUnique() throws Exception {

    	List<Integer> resultlist = new ArrayList<Integer>();
    	resultlist.add(1);
    	resultlist.add(3);
    	resultlist.add(5);
    	resultlist.add(7);

    	Ex5 ex5 = new Ex5();
    	assertThat(ex5.unique(1,3,5,3,7,3,1,1,5), is(resultlist) );
    }
}