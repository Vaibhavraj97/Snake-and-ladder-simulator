package Simulatorsnakeladder;
import java.util.Random;
public class Snakeladderuc2 {
		 static int diceNumber = 0;
	     static int numberOfTimesDiceRoll = 0;
		
		
		 public static int throwDice(){
	         numberOfTimesDiceRoll = numberOfTimesDiceRoll+1;//for counting number of times dice roll//
	         Random r=new Random();
	         int random = r.nextInt(6)+1;
	         //int r1 = 1 + (random % 6);
	         return random;
		 }
		
		  public static void main(String[] args) {
			  
					 diceNumber=throwDice();
			         System.out.println("*******Number of times dice roll  =>"+numberOfTimesDiceRoll+"**********");
				 
			         }
			}


