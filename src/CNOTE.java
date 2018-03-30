import java.util.Scanner;

public class CNOTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			int k=in.nextInt();
			int n=in.nextInt();
			int diff=x-y;
			int out=0;
			for(int i=0;i<n;i++)
			{
				int page=in.nextInt();
				int cash=in.nextInt();
				if(cash<=k && page>=diff )
				{
				 out=1;
				}
			}
			if(out==1)
			{
				System.out.println("LuckyChef");
			}
			else {
				System.out.println("UnluckyChef");
			}
			t--;
		}
		in.close();

	}

}
