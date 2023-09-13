package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Start Amount: ");
		int firstStartAmount = in.nextInt();
		System.out.println("Win Chance: ");
		int winChance = in.nextInt();
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.println("Loss Limit: ");
		int lossLimit = in.nextInt();
		System.out.println("Total Simulations: ");
		int totalSimulations = in.nextInt();

		int numLosses = 0;

		for ( int count = 1; count <= totalSimulations; count++)
		{
			int numPlays = 0;
			int startAmount = firstStartAmount;
			while ((winLimit > startAmount) && (startAmount > lossLimit))
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
				numPlays++;
			}
			
			System.out.println("Day " + count);
			System.out.println("Number of plays: " + numPlays);
			if (startAmount > lossLimit)
			{
				System.out.println("Win");
			}
			else
			{
				System.out.println("Loss");
				numLosses++;
			}
			
		}
		
		System.out.println("Number of losses: " + numLosses);
		System.out.println("Simulations: " + totalSimulations);
		double ruinRate =  ((numLosses*1.0)/totalSimulations);
		System.out.println("Ruin rate from Simulation: " + (ruinRate));
		
		double expectedRuin = ((1 - (winChance*1.0))/winChance);
		expectedRuin = (((Math.pow(expectedRuin, (firstStartAmount*1.0)))-(Math.pow(expectedRuin, (winLimit*1.0))))/(1-(Math.pow(expectedRuin, (winLimit*1.0)))));
		
		System.out.println("Expected ruin rate: " + expectedRuin);
		

		

	}

}
