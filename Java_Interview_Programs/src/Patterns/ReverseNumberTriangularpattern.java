/*
  1 2 3 4
   2 3 4
    3 4
     4
 */

package Patterns;

public class ReverseNumberTriangularpattern {
	public static void main(String[] args) {


		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++)
			{
				System.out.print(j +" ");
			}

		System.out.println();
		}

	}


}
