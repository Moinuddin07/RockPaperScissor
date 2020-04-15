package Moin.game;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class player4 {
	static String user1Choice;
	static String user2Choice;
	static String user3Choice;
	static String user4Choice;
	static int user4count;
	static int user4_2_count;
	static int user4_3_count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 player1 player1= context.getBean(player1.class);
		 player2 player2=context.getBean(player2.class);
		 player3 player3=context.getBean(player3.class);
		 player4 player4=context.getBean(player4.class);
		Random random=new Random();
		
	}
	/*
	public static void value1(Random random,String user1Choice,String user2Choice,String user3Choice,String user4Choices)
	  {
	    	 
	    	value2(random, user1Choice,user2Choice,user3Choice,user4Choice);
	    	
	    	}*/
	public static void value2(Random random,String user1Choice,String user2Choice,String user3Choice,String user4Choice)
	{

    	int pl4Withpl1=player1Withplayer2(user4Choice,user1Choice);
    	System.out.println("The Value of Player 4 with Player 1 : "+pl4Withpl1);
    	
    	int pl4Withpl2=player1Withplayer3(user4Choice,user2Choice);
    	System.out.println("The Value of Player 4 with Player 2 : "+pl4Withpl2);
    	
    	
    	int pl4Withpl3=player1Withplayer4(user4Choice,user3Choice);
    	System.out.println("The Value of Player 4 with Player 3 : "+pl4Withpl3);
    	System.out.println("----------------------------------------------------------------");
    	
	}
	
	
	public static  int player1Withplayer2(String user4Choice, String user1Choice)
	   { 
		   
		   if(user4Choice=="rock")
			   {
			   				if(user4Choice.equals(user1Choice))
				   				 user4count+=0;
				   			else if((user4Choice=="rock") && (user1Choice=="paper"))
				   				user4count+=0;
				   			else if((user4Choice=="rock") && (user1Choice=="scissor"))
				   				 user4count+=1;	
			   				
			   }
			else if(user4Choice=="paper")
				   {
					   			if(user4Choice.equals(user1Choice))
					   				user4count+=0;
					   			else if((user4Choice=="paper" && user1Choice=="rock"))
					   				  user4count+=1;
					   			else if((user4Choice=="paper") &&( user1Choice=="scissor"))
					   				user4count+=0;			
				   }
			else if(user4Choice=="scissor")
				   {
					   		if(user4Choice.equals(user1Choice))
					   			user4count+=0;
					   		else if((user4Choice=="scissor" && user1Choice=="rock"))
					   			user4count+=0;
					   		else if((user4Choice=="scissor") &&( user1Choice=="paper"))
					   			user4count+=1; 		
				   }
		   return user4count;
				   }
	   
	   public static  int player1Withplayer3(String user4Choice, String user2Choice)
	   { 
		   
		   if(user4Choice=="rock")
			   {
			   				if(user4Choice.equals(user2Choice))
				   				 user4_2_count+=0;
				   			else if((user4Choice=="rock") && (user2Choice=="paper"))
				   				user4_2_count+=0;
				   			else if((user2Choice=="rock") && (user2Choice=="scissor"))
				   				 user4_2_count+=1;	
			   				
			   }
			else if(user4Choice=="paper")
				   {
					   			if(user4Choice.equals(user2Choice))
					   				user4_2_count+=0;
					   			else if((user4Choice=="paper" && user2Choice=="rock"))
					   				  user4_2_count+=1;
					   			else if((user4Choice=="paper") &&( user2Choice=="scissor"))
					   				user4_2_count+=0;			
				   }
			else if(user4Choice=="scissor")
				   {
					   		if(user4Choice.equals(user2Choice))
					   			user4_2_count+=0;
					   		else if((user4Choice=="scissor" && user2Choice=="rock"))
					   			user4_2_count+=0;
					   		else if((user4Choice=="scissor") &&( user2Choice=="paper"))
					   			user4_2_count+=1; 		
				   }
		   return user4_2_count;
				   }
	   
	   public static  int player1Withplayer4(String user4Choice, String user3Choice)
	   { 
		   
		   if(user4Choice=="rock")
			   {
			   				if(user4Choice.equals(user3Choice))
				   				 user4_3_count+=0;
				   			else if((user4Choice=="rock") && (user3Choice=="paper"))
				   				user4_3_count+=0;
				   			else if((user4Choice=="rock") && (user3Choice=="scissor"))
				   				 user4_3_count+=1;	
			   				
			   }
			else if(user4Choice=="paper")
				   {
					   			if(user4Choice.equals(user3Choice))
					   				user4_3_count+=0;
					   			else if((user4Choice=="paper" && user3Choice=="rock"))
					   				  user4_3_count+=1;
					   			else if((user4Choice=="paper") &&( user3Choice=="scissor"))
					   				user4_3_count+=0;			
				   }
			else if(user4Choice=="scissor")
				   {
					   		if(user4Choice.equals(user3Choice))
					   			user4_3_count+=0;
					   		else if((user4Choice=="scissor" && user3Choice=="rock"))
					   			user4_3_count+=0;
					   		else if((user4Choice=="scissor") &&( user3Choice=="paper"))
					   			user4_3_count+=1; 		
				   }
		   return user4_3_count;
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
