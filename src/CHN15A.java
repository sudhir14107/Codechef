import java.util.Scanner;

public class CHN15A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int count=0;
			int n=in.nextInt();
			int k=in.nextInt();
			for(int i=0;i<n;i++)
			{
				int a=in.nextInt()+k;
				if(a%7==0)
				{
					count++;
				}
			}
			System.out.println(count);
			t--;
		}
		in.close();

	}

}
