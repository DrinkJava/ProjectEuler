
public class Euler10 {
	public static boolean isPrime(long num) {
		long lastDigit = num % 10;
		if (num <= 1)
			return false;
		if (num <= 3)
			return true;
		if (lastDigit % 2 == 0 || num % 3 == 0)
			return false;
		long i = 5;
		while (i*i <= num) {
			if (num % i == 0 || num % (i+2) == 0)
				return false;
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		
		for (long i = 0; i < 2000000; i++) {
			if (isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
	

}
