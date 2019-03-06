
public class MathRandom {
	public static void main(String[] args) {
		int a = (int) (40 * Math.random());
		System.out.println(a);

		/* (数据类型)(最小值+Math.random()*(最大值-最小值+1)) */
		int b = (int) (40 + Math.random() * (120 - 40 + 1));
		System.out.println(b);
	}
}
