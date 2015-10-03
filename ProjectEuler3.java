/*
  A program to find the largest Prime factors of 600851475143.
*/
public class ProjectEuler3 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long primeSource = 600851475143L;
		long largestPrime = 1;
		for (long i = 3; i < primeSource/largestPrime; i+=2) {
			if (primeSource % i == 0) {
				boolean isPrime = true;
				for (long j = 3; j < i; j+=2) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					largestPrime = i;
					//System.out.println("Factor: "+i);
				}
			}
		}
		System.out.println("Largest Prime Factor of 600851475143: "+largestPrime);
		long et = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed Time: "+et);
	}
}