package magic8Ball;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class magic8Ball {
	
	
	String[] ballOutcome = {"It is certain." , "It is decidedly so.", "Without a doubt.", "Yes – definitely.","You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.","Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", " Outlook not so good.", "Very doubtful."};
	
	public magic8Ball() {
		
	}
	

	public int getRandomNumber() { //Generate random number from 0-20
		Random number = new Random();
		int random = number.nextInt(20);
		return random;
		}
	
	
	public String question() {
		String input;
		Scanner question = new Scanner(System.in);
		input=question.nextLine();
		return "Your question is: " + input;
	}
	
	public String getOutcomes() {
		 
		String[] outcome = ballOutcome;
		Random dice = new Random();
		int d = dice.nextInt(19);
		System.out.println(outcome[d]);
		return "The outcome is: " + outcome[d];
		
	}
	
	
	public static void main(String[] args) {
		String answer;
		Scanner scan = new Scanner(System.in);
		
		
		
		magic8Ball ball = new magic8Ball();
		
		for(int i = 0; i < 20; i++) {
		System.out.println("");
			
		System.out.println("Hello welcome to JMagic 8 Ball!");
		
		System.out.println("");
		
		System.out.println("Do you want to use the Magic 8 Ball?, type 'Yes', or 'No'");
		
		answer=scan.next();
		
		if(answer.equals("Yes")) {
			System.out.println("Start by asking any question to the magic 8 ball:");
			
			System.out.println(ball.question());
			
			System.out.println("");
			
			
			System.out.println("In 7 seconds you will receive a random number..."); //Generating random number
			try {
	            // thread to sleep for 7000 milliseconds
	            Thread.sleep(7000);
	         } catch (Exception e) {
	            System.out.println(e);
	         }
			System.out.println(ball.getRandomNumber());

			System.out.println("Generating Magical Outcome:..."); //Printing outcome
				try {
		            // thread to sleep for 7000 milliseconds
		            Thread.sleep(7000);
		         } catch (Exception e) {
		            System.out.println(e);
		         }
				System.out.println(ball.getOutcomes());
				
				
			} else if(answer.equals("No")) {
				System.out.println("Program will not continue");
			} else {
				System.out.println("Invalid");
			}
			
			
			
			
			
			}	
		}
				
			}
			
			
			
			
			

