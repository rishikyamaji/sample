package algorithms.implement;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int people=5;
		int peopleadvertising=0;
		for(int i=0;i<n;i++)
		{
			people=people/2;
			peopleadvertising+=people;
			people=people*3;
			
		}
		System.out.println(peopleadvertising);

	}

}
