import java.util.stream.IntStream;

public class Euler5 {

	static boolean divisible(int n) {
		return (n % 20 == 0 && n % 19 == 0 && n % 18 == 0 && n % 17 == 0 && n % 16 == 0 &&
				n % 15 == 0 && n % 14 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = IntStream.range(2520, Integer.MAX_VALUE)
				.filter(n -> divisible(n))
				.findFirst()
				.getAsInt();
		System.out.println(ans);
	}

}
