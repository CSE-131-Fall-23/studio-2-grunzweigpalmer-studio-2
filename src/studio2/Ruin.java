package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("Win Chance: ");
		int winChance = in.nextInt();
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.println("Loss Limit: ");
		int lossLimit = in.nextInt();
		
		
		
		while (winLimit > startAmount && startAmount > lossLimit)
		{
			int random = (int) (Math.random()*100-0);
			if(random < winChance)
			{
				startAmount ++;
			}
			else
			{
				startAmount --;
			}
		}
		
		if (startAmount > lossLimit)
		{
			System.out.println("Win");
		}
		else
		{
			System.out.println("Loss");
		}
		
	}

}
