package ex4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Ex4Test {
    /**
     * 例題4
     * 同じ長さの2つのリストから、交互に要素を取り、1つのリストにしてください。
     *
     * 入力例: ["a", "b", "c"] と ["1", "2", "3"]
     * 出力例: ["a", "1", "b", "2", "c", "3"]
     *
     * assertThat と is を使って、適切なテストを作ってください。
     */
    @Test
    public void testConcat() throws Exception {
    	List<String> list1 = new ArrayList<String>();
    	list1.add("a");
    	list1.add("b");
    	list1.add("c");

    	List<String> list2 = new ArrayList<String>();
    	list2.add("1");
    	list2.add("2");
    	list2.add("3");

    	List<String> resultlist = new ArrayList<String>();
    	resultlist.add("a");
    	resultlist.add("1");
    	resultlist.add("b");
    	resultlist.add("2");
    	resultlist.add("c");
    	resultlist.add("3");

    	Ex4 ex4 = new Ex4();
    	assertThat(ex4.concat(list1, list2), is(resultlist) );
    }

}