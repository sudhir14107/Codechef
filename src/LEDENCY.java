import java.util.Scanner;

public class LEDENCY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int c=in.nextInt();
			//int[] a=new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum=sum+in.nextInt();
			}
			if(sum<=c)
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			t--;
		}
		in.close();
		
	}

}
