package ex1;

public class Ex1 {
    /**
     * 例題1
     * 与えられた数列を合計してください。
     *
     * 入力例: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * 出力例: 55
     */
    public int sum(final int... args) {
    	int sum = 0;

    	for(int cnt =0; cnt < args.length; cnt ++){
    		sum = sum + args[cnt];
    	}

		return sum;
    }

    //失敗する→グリーンにする→リファクタリングする
    //このゴールデンループをそのタイミングでやらないと、その後絶対やらないよ！

    //ゴール設定してから、最適なかたちに実装していくんで新人教育にも最適！

}
