import java.util.Scanner;

public class SALARY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int min=10000, sum=0;
			int n=in.nextInt();
			for(int i=0;i<n;i++)
			{
				int a=in.nextInt();
				sum=sum+a;
				if(a<min)
				{
					min=a;
				}
			}
			//System.out.println(min);
			int out=sum-(n*min);
			System.out.println(out);
			
			t--;
		}
		in.close();

	}

}
