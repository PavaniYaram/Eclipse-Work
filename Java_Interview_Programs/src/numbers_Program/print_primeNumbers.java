package numbers_Program;

public class print_primeNumbers {

	public static void main(String[] args) {
		int flag;
		System.out.println("Prime Number between 1-100: ");
		for(int i=2;i<=100;i++) {
			flag=0;

		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0) {
				flag=1;

			}
		}
		if(flag==0)
		{
			System.out.print(i+ " ");
		}
	}


	}

}
