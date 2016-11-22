//import java.util.Scanner;
//
//public class SwitchStructure
//	{
//		 boolean noWinRoll = true;
//		public static void main(String[] args)
//			{
//				exercise1();
////				exercise2();
////				exercise3();
//				
//			}	
//		public static void exercise1()
//		{
//			int dieRoll1 = (int)(Math.random()*6)+1;
//			int dieRoll2 = (int)(Math.random()*6)+1;
//			int diceTotal = dieRoll1 + dieRoll2;
//		
//	switch(diceTotal)
//			{
//			case 2:
//			case 12:
//				{
//					System.out.println("You rolled " + dieRoll1 + " and " + dieRoll2 + " to get " + diceTotal);	
//				
//					System.out.println("You lose.");
//					break;
//				}
//			case 7:
//			case 11:
//				{
//					System.out.println("You rolled " + dieRoll1 + " and " + dieRoll2 + " to get " + diceTotal);
//				
//					System.out.println("You win.");
//					break;
//				}
//			default:
//					{
//					System.out.println("You rolled " + dieRoll1 + " and " + dieRoll2 + " to get " + diceTotal);						}
//					}
//	while(noWinRoll)
//		{
//		Scanner userInput3 = new Scanner (System.in);
//		System.out.println("Press enter to re-roll." );
//		String enter = userInput3.nextLine();
//	
//		}
//	}
//		
//				