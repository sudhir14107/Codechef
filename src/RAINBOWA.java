import java.util.Scanner;

public class RAINBOWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
			}
			int i=0,j=n-1,out=0;
			while(i<=j && j>=n/2 && i<=n/2)
			{
				if(a[i]!=a[j] || a[i]>= (i+1))
				{
					out=1;
					break;
				}
				else {
					i++;
					j--;
				}
			}
			if(out==1)
			{
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			}
			t--;
		}
		in.close();


	}

}
