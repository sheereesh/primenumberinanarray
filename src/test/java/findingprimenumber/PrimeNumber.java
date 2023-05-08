package findingprimenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<array.length;i++) {
			{
				int count=0;
				for(int j=1;j<=array[i];j++) {
					if(array[i]%j==0) {
						count++;
					}
				}
					if(count==2) {
						System.out.println("it is prime number"+array[i]);
				}
				else
				{
					System.out.println("not prime number"+array[i]);
				}
			}
		}

	}

}
 