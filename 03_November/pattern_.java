/*

*/
package dheeraj_15;

public class Pattern_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) // (This is for row )
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");	//(This for space)
			}
			for(j=1;j<2*i;j++)
			{
				System.out.print("*"); //(This is star)
				
			}
			System.out.println( ); // ( This is for new line)
		}
	}
	
}



	
