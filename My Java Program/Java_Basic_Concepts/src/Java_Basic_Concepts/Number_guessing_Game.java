package Java_Basic_Concepts;
import java.util.*;

public class Number_guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		
		int randomNumber=rand.nextInt(100)+1;
		int try_count=0;
		while(true){//random number between 1 and 100
			try_count++;
		System.out.println("Enter your guess:1-100");
		Scanner scanner=new Scanner(System.in);
		int playerGuess=scanner.nextInt();
		if(playerGuess==randomNumber) {
			System.out.println("Correct!");
			System.out.println("It took you"+try_count+"tries");
			scanner.close();
			break;
			
		}
		else if(randomNumber>playerGuess) {
			System.out.println("Number id greater");
		}
		else {
			System.out.println("Number is smaller");
		}
		}
		

	}

}

