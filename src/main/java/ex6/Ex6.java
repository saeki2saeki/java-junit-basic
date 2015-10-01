package ex6;

import java.util.Arrays;

public class Ex6 {
    /**
     * 例題6
     * 数列が文字列で与えられます。それぞれの数字の出現数を表す文字列を作ってください。
     *
     * 入力例: "1 3 5 3 7 3 1 1 5"
     * 出力例: "1(3) 3(3) 5(2) 7(1)"
     *
     * assertThat と is を使って、適切なテストを作ってください。
     *
     * @param input 与えられた数字の文字列
     * @return それぞれの数字の出現数の文字列
     */
    public String count(final String input) {
    	String result = "";

    	String[] list =input.split(" ");
    	Arrays.sort(list);

    	String tempnum = "";
    	int tempnum_cnt = 1;

    	for(int i = 0; i < list.length; i ++) {
    		if (tempnum.equals(list[i])){
    			tempnum_cnt++;
    		} else {
    			if (i != 0) {
        			result =  result + tempnum + "(" + tempnum_cnt + ") ";
    			}
        			tempnum = list[i];
        			tempnum_cnt = 1;
    		}
    	}
		result = result + tempnum + "(" + tempnum_cnt + ")";


        return result;
    }
}

