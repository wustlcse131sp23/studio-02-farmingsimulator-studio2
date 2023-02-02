package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startAmount=10.0;
		double winChance=0.5;
		double winLimit=20.0;
		double totalSimulations = 500;
		
		double numPlays=0;
		double numLosses=0;
		double numWins=0;
		String result="";
		for (numPlays=1; numPlays<totalSimulations; numPlays++)
		{
			int rollsPerPlay=0;
			startAmount=10.0;
			while (startAmount>0 && startAmount<winLimit)
			
			{
				rollsPerPlay ++;
				double roll= Math.random();
				if (roll < winChance)
				
				{
					startAmount--;
					
				}
				else 
				{
					startAmount++;	
					
				}
				
			
			
				if (startAmount==0)
				{
					result = "LOSE";
					numLosses ++;
				}
				else if (startAmount>=winLimit) 
				{
					result = "WIN";
					numWins ++;
				}
			}
			System.out.println("Simulation "+ numPlays + ": " + rollsPerPlay + " " + result);	
		}
			System.out.println("Number of Ruins: " + numLosses);
			System.out.println("Number of Simulations: " + numPlays);
			startAmount = 10.0;
			double ruinRate = (numLosses/numPlays);
			double ratio = ((Math.round(100000.0*startAmount/winLimit))/100000.0);
			double expRuinRate = (1.0 - ratio);
			System.out.print("Ruin Rate: " + ruinRate);
			System.out.println("Expected Ruin Rate: " + expRuinRate);
			
		
		
		
	}

}
