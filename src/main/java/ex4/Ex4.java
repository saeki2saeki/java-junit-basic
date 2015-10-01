package ex4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    /**
     * 例題4
     * 同じ長さの2つのリストから、交互に要素を取り、1つのリストにしてください。
     *
     * 入力例: ["a", "b", "c"] と ["1", "2", "3"]
     * 出力例: ["a", "1", "b", "2", "c", "3"]
     *
     * assertThat と is を使って、適切なテストを作ってください。
     *
     * @param listA リストその1
     * @param listB リストその2
     * @return 交互に要素を取り結合したリスト
     */
    public List<String> concat(final List<String> listA, final List<String> listB) {
    	List<String> resultList = new ArrayList<String>();
    	int seq = 0;
    	for(int i = 0; i < listA.size(); i ++ ){
    		resultList.add(seq++, listA.get(i));
    		resultList.add(seq++, listB.get(i));
    	}
        return resultList;
    }
}
