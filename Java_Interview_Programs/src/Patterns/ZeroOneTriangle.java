/*
  1
  0 1
  1 0 1
  0 1 0 1
 */
package Patterns;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i==j) || (i-j==2))  // we can use (i+j)%2==0
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0 + " ");
				}

			}

			System.out.println();
		}
}
}
