import java.util.ArrayList;

public class Euler3 {

	public static boolean isPrime(long num) {
		long lastDigit = num % 10;
		if (num < 1)
			return false;
		if (num < 3)
			return true;
		if (lastDigit % 2 == 0 || num % 3 == 0)
			return false;
		long i = 5;
		while (i < Math.sqrt(num)) {
			if (num % i == 0 || num % (i+2) == 0)
				return false;
			i ++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> factors = new ArrayList<Long>();
		long d = 2;
		long n = 600851475143L;
		while (n > 1) {
			while (n % d == 0) {
				factors.add(d);
				n /= d;
			}
			d++;
			if (d*d > n) {
				if (n > 1) {
					factors.add(n);
					break;
				}
			}
		}
		
		factors.forEach(e -> System.out.println(e));
		System.out.print(isPrime(600851475143L));
	}

}
