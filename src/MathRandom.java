
public class MathRandom {
	public static void main(String[] args) {
		int a = (int) (40 * Math.random());
		System.out.println(a);

		/* (��������)(��Сֵ+Math.random()*(���ֵ-��Сֵ+1)) */
		int b = (int) (40 + Math.random() * (120 - 40 + 1));
		System.out.println(b);
	}
}
