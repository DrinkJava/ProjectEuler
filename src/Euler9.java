
public class Euler9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < 1000; j++)
				for (int k = 0; k < 1000; k++)
					if ((i+j+k == 1000) && (i < j) && (j < k) && (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))) {
						System.out.println(i*j*k);
						System.out.printf("%d %d %d", i, j, k);
					}
						
	
	}

}
