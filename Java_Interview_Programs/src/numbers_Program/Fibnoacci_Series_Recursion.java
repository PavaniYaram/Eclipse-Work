package numbers_Program;

public class Fibnoacci_Series_Recursion {

	static int n1=0;
	static int n2=1;
	static int n3=0;

	static void printFibonacci(int count)
	{
		if(count>0)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-1);
		}
	}

	public static void main(String[] args) {
		int count=10;
		System.out.print(n1+ " "+n2); //printing 0 and 1
		printFibonacci(count-2); //n-2 beacuse 2 numbers are already printed

	}

}
