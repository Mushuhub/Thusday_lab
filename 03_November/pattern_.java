/*

*/
package dheeraj_15;

public class Pattern_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) // (This is for row )
		{
			for(j=4;j>=i;j--)//(This is for coloum)
			{
				System.out.print(" ");	
			}
			for(j=1;j<2*i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println( );
		}
	}
	
}



	
