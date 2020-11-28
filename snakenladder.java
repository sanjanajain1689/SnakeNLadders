
public class snakenladder {
	static int positionChange = 0;
	public static void main(String args[]){
		System.out.println("Welcome to Snake & Ladder Simulator");
		final int START_POSITION = 0;
		int positionPlayer1 = START_POSITION;
		int positionPlayer2 = START_POSITION;
		int dieCastNumberPlayer1 = 0;
		int dieCastNumberPlayer2 = 0;
		while(positionPlayer1!=100 && positionPlayer2!=100)
		{
			positionChange = 1;
			while(positionChange>0 && positionPlayer1!=100)
			{
				positionPlayer1 = calPositionChange(positionPlayer1);
				System.out.println("The current position of Player 1 is:" + positionPlayer1);
				dieCastNumberPlayer1++;
			}
			if(positionPlayer1==100)
				break;
			positionChange = 1;
			while(positionChange>0 && positionPlayer2!=100)
			{
				positionPlayer2 = calPositionChange(positionPlayer2);
				System.out.println("The current position of Player 2 is:" + positionPlayer2);
				dieCastNumberPlayer2++;
			}
		}
		if(positionPlayer1==100)
			System.out.println("Times die cast by Winner Player 1 : " + dieCastNumberPlayer1);
		else
			System.out.println("Times die cast by Winner Player 2 : " + dieCastNumberPlayer2);
	}
	private static int calPositionChange(int position)
	{
		//int positionChange = 0;
		int dieNumber = (int) Math.floor(Math.random()*60)%6 + 1;
		System.out.println("The number on the die is: " + dieNumber);
		int playOption = (int) Math.floor(Math.random()*60)%3;
		if(playOption==0)
			positionChange = 0;
		else if(playOption==1)
			positionChange = dieNumber;
		else
			positionChange = -1*dieNumber;
		position += positionChange;
		if(position<0)
			position=0;
		if(position>100)
			position -= positionChange;
		return position;
	}
}
