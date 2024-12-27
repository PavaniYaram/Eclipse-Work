package numbers_Program;

public class fibnoacci_Series {

	public static void main(String[] args) {



		int count =10,a=0,b=1,c;
		System.out.print(a+" "+b);

		for(int i=0; i<count;i++)
		{
			c= a+b;
			a=b;
			b=c;
			System.out.print(" "+c);

		}

	}


}
