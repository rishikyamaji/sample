import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		int n=sn.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(i,sn.nextInt());
		}
		int temp1=sn.nextInt();
		for(int p=0;p<temp1;p++)
		{

			String s=sn.next();
			if(s.equals( "Insert"))
			{
				int x=sn.nextInt();
				int y=sn.nextInt();
				l.add(x, y);
			}else if(s.equals("Delete"))
			{
				int z=sn.nextInt();
				l.remove(z);

			}
		}
		sn.close();
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			Integer ir = (Integer)it.next();
			System.out.print(ir+" ");}
	}

}		



