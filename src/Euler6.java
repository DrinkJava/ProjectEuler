import java.util.stream.LongStream;
public class Euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sumOfSq = LongStream.range(1, 101)
				.map(n -> n*n)
				.sum();
		long sum = LongStream.range(1, 101)
				.sum();
		long sqOfSum = (long) Math.pow(sum, 2);
		
		System.out.println(sqOfSum - sumOfSq);
	}

}
