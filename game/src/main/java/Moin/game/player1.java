package Moin.game;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class player1 {
	
	static String user1Choice;
	static String user2Choice;
	static String user3Choice;
	static String user4Choice;
	static int user1count;
	static int user1_2_count;
	static int user1_3_count;

	public static void main(String []args)
	{
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 player1 player1= context.getBean(player1.class);
		 player2 player2=context.getBean(player2.class);
		 player3 player3=context.getBean(player3.class);
		 player4 player4=context.getBean(player4.class);
		Random random=new Random();
	}
		
	
	  public static void value1(Random random)
	  {
	    	 System.out.println("************************************************************");
	    	
	    	System.out.print("Player 1 selected :");
	    	String user1Choice=player1.randomGen(random);
	    	System.out.println(user1Choice);
	    	
	    	System.out.println("************************************************************");
	    	
	    	System.out.print("Player 2 selected :");
	    	String user2Choice=player2.randomGen(random);
	    	System.out.println(user2Choice);
	    	
	    	System.out.println("************************************************************");
	    	
	    	System.out.print("Player 3 selected :");
	    	String user3Choice=player3.randomGen(random);
	    	System.out.println(user3Choice);
	    	
	    	System.out.println("************************************************************");
	    	
	    	System.out.print("Player 4 selected :");
	    	String user4Choice=player4.randomGen(random);
	    	System.out.println(user4Choice);
	    	System.out.println("**************************************************************");
	    	
	    	value2(random, user1Choice,user2Choice,user3Choice,user4Choice); 
	    	
	    	}
	  
	public static void value2(Random random,String user1Choice,String user2Choice,String user3Choice,String user4Choice)
	{

    	int pl1Withpl2=player1Withplayer2(user1Choice,user2Choice);
    	System.out.println("The Value of Player 1 with Player 2 : "+pl1Withpl2);
    	
    	int pl1Withpl3=player1Withplayer3(user1Choice,user3Choice);
    	System.out.println("The Value of Player 1 with Player 3 : "+pl1Withpl3);
    	
    	
    	int pl1Withpl4=player1Withplayer4(user1Choice,user4Choice);
    	System.out.println("The Value of Player 1 with Player 4 : "+pl1Withpl4);
    	//System.out.println("***************************************************");
    	System.out.println("----------------------------------------------------------------");
    	player2.value2(random,user1Choice,user2Choice,user3Choice,user4Choice);// calling value2 method of player2class to pass the same  random value;
    	
	}
	
	public static  int player1Withplayer2(String user1Choice, String user2Choice)// here comparing player 1 value with player2
	   { 
		   
		   if(user1Choice=="rock")
			   {
			   				if(user1Choice.equals(user2Choice))
				   				 user1count+=0;
				   			else if((user1Choice=="rock") && (user2Choice=="paper"))
				   				user1count+=0;
				   			else if((user1Choice=="rock") && (user2Choice=="scissor"))
				   				 user1count+=1;	
			   				
			   }
			else if(user1Choice=="paper")
				   {
					   			if(user1Choice.equals(user2Choice))
					   				user1count+=0;
					   			else if((user1Choice=="paper" && user2Choice=="rock"))
					   				  user1count+=1;
					   			else if((user1Choice=="paper") &&( user2Choice=="scissor"))
					   				user1count+=0;			
				   }
			else if(user1Choice=="scissor")
				   {
					   		if(user1Choice.equals(user2Choice))
					   			user1count+=0;
					   		else if((user1Choice=="scissor" && user2Choice=="rock"))
					   			user1count+=0;
					   		else if((user1Choice=="scissor") &&( user2Choice=="paper"))
					   			user1count+=1; 		
				   }
		   return user1count;// this will return the value either 0 or 1 based on  above condition;
				   }
	   
	   public static  int player1Withplayer3(String user1Choice, String user3Choice)
	   { 
		   
		   if(user1Choice=="rock")
			   {
			   				if(user1Choice.equals(user3Choice))
				   				 user1_2_count+=0;
				   			else if((user1Choice=="rock") && (user3Choice=="paper"))
				   				user1_2_count+=0;
				   			else if((user1Choice=="rock") && (user3Choice=="scissor"))
				   				 user1_2_count+=1;	
			   				
			   }
			else if(user1Choice=="paper")
				   {
					   			if(user1Choice.equals(user3Choice))
					   				user1_2_count+=0;
					   			else if((user1Choice=="paper" && user3Choice=="rock"))
					   				  user1_2_count+=1;
					   			else if((user1Choice=="paper") &&( user3Choice=="scissor"))
					   				user1_2_count+=0;			
				   }
			else if(user1Choice=="scissor")
				   {
					   		if(user1Choice.equals(user3Choice))
					   			user1_2_count+=0;
					   		else if((user1Choice=="scissor" && user3Choice=="rock"))
					   			user1_2_count+=0;
					   		else if((user1Choice=="scissor") &&( user3Choice=="paper"))
					   			user1_2_count+=1; 		
				   }
		   return user1_2_count;
				   }
	   
	   public static  int player1Withplayer4(String user1Choice, String user4Choice)
	   { 
		   
		   if(user1Choice=="rock")
			   {
			   				if(user1Choice.equals(user4Choice))
				   				 user1_3_count+=0;
				   			else if((user1Choice=="rock") && (user4Choice=="paper"))
				   				user1_3_count+=0;
				   			else if((user1Choice=="rock") && (user4Choice=="scissor"))
				   				 user1_3_count+=1;	
			   				
			   }
			else if(user1Choice=="paper")
				   {
					   			if(user1Choice.equals(user4Choice))
					   				user1_3_count+=0;
					   			else if((user1Choice=="paper" && user4Choice=="rock"))
					   				  user1_3_count+=1;
					   			else if((user1Choice=="paper") &&( user4Choice=="scissor"))
					   				user1_3_count+=0;			
				   }
			else if(user1Choice=="scissor")
				   {
					   		if(user1Choice.equals(user4Choice))
					   			user1_3_count+=0;
					   		else if((user1Choice=="scissor" && user4Choice=="rock"))
					   			user1_3_count+=0;
					   		else if((user1Choice=="scissor") &&( user4Choice=="paper"))
					   			user1_3_count+=1; 		
				   }
		   return user1_3_count;
				   }
	 public static String randomGen(Random random)
	    {
	    	 int wordNumber=random.nextInt(3)+1;// This will generate random no"s from 1 to 3;
			String playerSelected = null;
			if(wordNumber==1)
			{
				playerSelected="rock";
			}
			else if(wordNumber==2)
			{
				playerSelected="paper";
				
			}
			else if(wordNumber==3)
			{
				playerSelected="scissor";
			}
				
	    	 return playerSelected; 
	    	 }
		
	

}
