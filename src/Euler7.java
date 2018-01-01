import java.util.ArrayList;

public class Euler7 {

	public static boolean isPrime(long num) {
		long lastDigit = num % 10;
		if (num <= 1)
			return false;
		if (num <= 3)
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
		ArrayList<Long> primes = new ArrayList<>();
		long n = 0;
		
		while (primes.size() < 10002) {
			if (isPrime(n))
				primes.add(n);
			n++;
		}
		System.out.println(primes);
	}

}
