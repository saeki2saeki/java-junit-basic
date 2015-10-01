package ex2;

public class Ex2 {
	/**
	 * 例題2 与えられた文字列を反対にしてください。
	 *
	 * 入力例: string 出力例: gnirts
	 *
	 * @param input
	 *            与えられた文字列
	 * @return 反対になった文字列
	 */
	public String reverse(final String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			result = result + input.substring(input.length() - i - 1, input.length() - i);
		}
		return result;
	}
}
