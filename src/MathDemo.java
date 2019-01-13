public class MathDemo {

	public static void main(String[] args) {

		System.out.println("100的平方根为" + sqrt(100));
		System.out.println("1000的立方根为" + cbrt(1000));
		System.out.println("2的5次方为" + pow(2, 5));
		System.out.println("124689,784623的最大值为" + max(124689, 784623));
		System.out.println("124689,784623的最小值为" + min(124689, 784623));
		System.out.println("-10的绝对值为" + abs(-10));
		System.out.println("10.1的向上取整为" + ceil(10.1));
		System.out.println("-10.1的向下取整为" + floor(-10.1));
		System.out.println("随机生成大于等于0小于1的数为" + random());
		System.out.println("10.7四舍五入为" + round(10.7));
		System.out.println("90 度的正弦值：" + sin(Math.PI / 2));
		System.out.println("0度的余弦值：" + cos(0));
		System.out.println("60度的正切值：" + tan(Math.PI / 3));
		System.out.println("1的反正切值： " + atan(1));
		System.out.println("π/2的角度值：" + toDegrees(Math.PI / 2));
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
