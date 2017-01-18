package algorithms;

import java.util.Scanner;

public class timeConversion {
	static int RealHour=00;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String time = in.next();
		String[ ] sub=time.split("[:]"); 
		String hour= sub[0];
		int result =Integer.parseInt(hour);
		String secondsAmPm=sub[2];
		char[] cha=secondsAmPm.toCharArray();
		 
		if(result==12&&cha[2]=='A')
		{
			RealHour=00;
		}
		else
		if(result==12&&cha[2]=='P')
		{
			 RealHour=result;
		}else
			if(result<12&&cha[2]=='P')
			{
			RealHour=result+12;
			}
			else
				if(result<12&&cha[2]=='A')
				{
					RealHour=result;
				}

		
		
		System.out.printf("%02d"+":"+"%s"+":"+cha[0]+cha[1],RealHour,sub[1]);
	}

}
