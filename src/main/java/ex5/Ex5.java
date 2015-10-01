package ex5;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    /**
     * 例題5
     * 与えられた数列から、重複していない数字のリストを作ってください。
     *
     * 入力例: 1, 3, 5, 3, 7, 3, 1, 1, 5
     * 出力例: [1, 3, 5, 7]
     *
     * assertThat と is を使って、適切なテストも作ってください。
     *
     * @param args 与えられた数列
     * @return 重複していない数字のリスト
     */
    public List<Integer> unique(final int... args) {
    	List resultList = new ArrayList<Integer>();

    	for (int i= 0; i< args.length; i++ ) {

    		boolean uniqflg = true;

    		for (int j = 0; j < resultList.size(); j ++ ) {
    			if (((Integer)resultList.get(j)).intValue() == args[i]){
    				uniqflg = false;
    				continue;
    			}
    		}

    		if(uniqflg) {
				resultList.add(args[i]);
    		}

    	}

    	return resultList;
    }
}
