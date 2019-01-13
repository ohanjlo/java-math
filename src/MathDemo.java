public class MathDemo {

	public static void main(String[] args) {

		System.out.println("100��ƽ����Ϊ" + sqrt(100));
		System.out.println("1000��������Ϊ" + cbrt(1000));
		System.out.println("2��5�η�Ϊ" + pow(2, 5));
		System.out.println("124689,784623�����ֵΪ" + max(124689, 784623));
		System.out.println("124689,784623����СֵΪ" + min(124689, 784623));
		System.out.println("-10�ľ���ֵΪ" + abs(-10));
		System.out.println("10.1������ȡ��Ϊ" + ceil(10.1));
		System.out.println("-10.1������ȡ��Ϊ" + floor(-10.1));
		System.out.println("������ɴ��ڵ���0С��1����Ϊ" + random());
		System.out.println("10.7��������Ϊ" + round(10.7));
		System.out.println("90 �ȵ�����ֵ��" + sin(Math.PI / 2));
		System.out.println("0�ȵ�����ֵ��" + cos(0));
		System.out.println("60�ȵ�����ֵ��" + tan(Math.PI / 3));
		System.out.println("1�ķ�����ֵ�� " + atan(1));
		System.out.println("��/2�ĽǶ�ֵ��" + toDegrees(Math.PI / 2));
	}

	public static double sin(double a) {
		return Math.sin(a);
	}

	public static double toDegrees(double angrad) {
		return angrad * 180.0 / Math.PI;
	}

	public static double cos(double a) {
		return Math.cos(a);
	}

	public static double atan(double a) {
		return Math.atan(a);
	}

	public static double tan(double a) {
		return Math.tan(a);
	}

	public static double sqrt(double a) {
		return Math.sqrt(a);
	}

	public static double cbrt(double a) {
		return Math.cbrt(a);
	}

	public static double pow(double a, double b) {
		return Math.pow(a, b);
	}

	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a <= b) ? a : b;
	}

	public static int abs(int a) {
		return (a < 0) ? -a : a;
	}

	public static double ceil(double a) {
		return Math.ceil(a);
	}

	public static double floor(double a) {
		return Math.floor(a);
	}

	public static double random() {
		return Math.random();
	}

	public static long round(double a) {
		return Math.round(a);
	}

}
