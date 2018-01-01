import java.util.stream.*;
import java.util.ArrayList;
public class Euler4 {

	static boolean isPalindrome(int n) {
		String num = Integer.toString(n);
		String rev = new StringBuilder(num).reverse().toString();
		if (num.equals(rev))
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(110011));
		int[] threeDigit = IntStream.range(100,1000).toArray();
		ArrayList<Integer> palins = new ArrayList<>();
		for (int i = 0; i < threeDigit.length; i++) {
			for (int j = 0; j < threeDigit.length; j++) {
				int prod = threeDigit[i] * threeDigit[j];
				if (isPalindrome(prod))
						palins.add(prod);
			}				
		}
		
		int max = palins.stream().max(Integer::compare).get();
		System.out.println(max);
		System.out.println(palins.size());
	}
		

}
