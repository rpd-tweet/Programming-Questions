import java.lang.Math;
import java.util.*;
class SquareCube
{
    int findNum(int num)
	{
		double num_check=num;
		
		while(num_check>0)	
		{
			double s= Math.sqrt(num_check);
			double c= Math.cbrt(num_check);
			if (s-Math.floor(s)==0 && c-Math.floor(c)==0)
				return (int)num_check;
			else
				num_check--;
		}
		return 0;
		
	}
	
	public static void main(String rpd[])
	{
		SquareCube squarecube = new SquareCube();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number :");
		int num = sc.nextInt();
		System.out.println("Output: "+squarecube.findNum(num));
	}
}