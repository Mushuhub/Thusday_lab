package dheeraj_15;

public class Pattern_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
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



	
