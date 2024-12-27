/*
   1
  1 1
 1 2 1
1 3 3 1

 */

package Patterns;

public class pascalsTriangle {
	public static void main(String[] args) {

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				//for left spacing
				System.out.print(" ");
			}

			int  x=1;

			for(int j=1;j<=i;j++) {

				System.out.print(x+ " ");
				x= x*(i-j)/j;
			}
			System.out.println();
	}

}
}
