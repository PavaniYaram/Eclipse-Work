package numbers_Program;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int num = 355, reversedNum=0, remainder;

		//store the number to originalNum
		int originalNum = num;

		//get the reverseof originalNum
		//store it in variable
		while(num!=0)
		{
			remainder = num%10;
			reversedNum = reversedNum *10 + remainder;
			num /=10;
		}

		//check if reversedNum and originalNum are equal
		{
			if(originalNum == reversedNum)
			{
				System.out.println(originalNum + " is Palindrome");
			}
			else
			{
				System.out.println(originalNum+ " is not Palindrome");
			}
		}




	}

}
