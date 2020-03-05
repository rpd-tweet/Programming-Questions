import java.util.*;
import java.util.Arrays;
import java.lang.Math;
class ProductSum
{
	void print1(int arr[],int ind)
	{
		for(int i=0;i<ind;i++)
			System.out.print(arr[i]+" ");
	}
	
	void print2(int arr[],int ind)
	{
		for(int i=0;i<ind;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	int sumOfFactors(int arr[],int ind)
	{
		int sum=0;
		for(int i=0;i<ind;i++)
			{
				sum+=arr[i];
			}
			return sum;
	}
	
	public static void main(String rpd[])
	{
		ProductSum productsum=new ProductSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Product, Sum and K:");
		int s=sc.nextInt();
		int p=sc.nextInt();
		int k=sc.nextInt();
		int ind=0;
		int arr[]=new int[p];
		int arrcpy[]=new int[p];
		int cpyind=0;
		for(int i=2;i<=(int)Math.sqrt(p);i++)
		{
			while(p%i==0)
			{
				arr[ind]=i;
				ind++;
				p=p/i;
			}
			
		}
		if (p>1)
		{
			arr[ind]=p;
			ind++;
		}
		int sum=0;
		if (ind==k)
		{
			sum=productsum.sumOfFactors(arr,ind);			
			if (sum==s)
			{
			productsum.print1(arr,ind);
			}
			else
			{
				System.out.println("No");
			}
		}
		else if(ind<k)
		{
			sum=productsum.sumOfFactors(arr,ind);
			if(s-sum==(k-ind))
			{
				productsum.print1(arr,ind);
				for(int i=ind;i<k;i++)
				{
					System.out.print(1+" ");
				}
			}
			else{
				System.out.println("No");
			}
		}
		else
		{
			//productsum.print1(arr,ind);
			int i=0;
			int cind=ind;
			while(i<cind)
			{
				if(ind!=k)
				{
				arrcpy[cpyind]=arr[i]*arr[i+1];
				cpyind++;
				i+=2;
				ind--;
				}
				else
				{
				  arrcpy[cpyind]=arr[i];
				  i++;
				  cpyind++;
				}
			}
			if (productsum.sumOfFactors(arrcpy,cpyind)==s)
			{
				productsum.print2(arrcpy,cpyind);
			}
			else
			{
				System.out.println("No");
			}
			
		}
			
		
	
			
		
		
	}
}
