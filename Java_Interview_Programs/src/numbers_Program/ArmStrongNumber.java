package numbers_Program;


public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 372, sum=0, remainder;

		//371 is Armstrong number
		//store the number to originalNum
		int originalNum = num;

		//get the reverseof originalNum
		//store it in variable
		while(num!=0)
		{
			remainder = num%10;
//			System.out.println(remainder);
			sum += (int)Math.pow(remainder, 3);
	//		System.out.println(sum);
			num /=10;
	//		System.out.println(num);
		}
		if(originalNum==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println(" Not Armstrong Number");
		}


	}



}
