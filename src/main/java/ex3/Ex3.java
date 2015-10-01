package ex3;

public class Ex3 {
    /**
     * 例題3
     * 与えられた数列から最も小さな数字を選んでください。
     *
     * 入力例: 100, 20, 5, 1, 200, 5
     * 出力例: 1
     *
     * assertThat と is を使って、適切なテストも作ってください。
     *
     * @param args 与えられた数列
     * @return 最も小さな数字
     */
    public int min(final int... args) {
    	int result = Integer.MAX_VALUE;
    	for(int i = 0; i < args.length; i ++) {
    		if (args[i] < result) {
    			result = args[i];
    		}
    	}
        return result;
    }
}
