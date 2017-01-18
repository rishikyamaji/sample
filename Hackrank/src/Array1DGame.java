import java.util.Scanner;

public class Array1DGame {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int n= sn.nextInt();
		String s="NO";
		for(int caseCount=1;caseCount<=n;caseCount++)
		{
			int GAmeSize=sn.nextInt();
			int GameKey=sn.nextInt();
			int[] GameArray=new int[GAmeSize];
			for(int insert=0;insert<GAmeSize;insert++)
			{
				GameArray[insert]=sn.nextInt();
			}



			for(int checkCount=0;checkCount<GAmeSize;checkCount++)
			{

			if(GameArray[checkCount]==0)
				{
					if(checkCount+GameKey<GAmeSize)
					{
						if(GameArray[checkCount+GameKey]==1)
						{
							s="NO";
							
						}else
							if(GameArray[checkCount+GameKey]==0&&checkCount+GameKey==GAmeSize-1)
							{
								s="YES";
								if(GameArray[caseCount+1]==1)
								{
									s="No";
									break;
								}
							}
						
					 }else
						if(checkCount+GameKey>GAmeSize)
						{
							if(GameArray[checkCount+1]==1)
							{
								s="No";
								break;
							}
							s="YES";
						}
				}



			}
			System.out.println(s);

		}
		sn.close();
	}
}
