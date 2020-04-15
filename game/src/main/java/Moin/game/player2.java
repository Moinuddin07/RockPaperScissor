package Moin.game;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class player2 {

	static String user1Choice;
	static String user2Choice;
	static String user3Choice;
	static String user4Choice;
	static int user2count;
	static int user2_3_count;
	static int user2_4_count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 player1 player1= context.getBean(player1.class);
		 player2 player2=context.getBean(player2.class);
		 player3 player3=context.getBean(player3.class);
		 player4 player4=context.getBean(player4.class);
		Random random=new Random();
		
		

	}/*
	public static void value1(Random random, String user1Choice,String user2Choice,String user3Choice,String user4Choice)
	  {
	    	 
	    	value2(random, user1Choice,user2Choice,user3Choice,user4Choice);
	    	
	    	}*/
	public static void value2(Random random,String user1Choice,String user2Choice,String user3Choice,String user4Choice)
	{

    	int pl2Withpl1=player1Withplayer2(user2Choice,user1Choice);
    	System.out.println("The Value of Player 2 with Player 1 : "+pl2Withpl1);
    	
    	int pl2Withpl3=player1Withplayer3(user2Choice,user3Choice);
    	System.out.println("The Value of Player 2 with Player 3 : "+pl2Withpl3);
    	
    	
    	int pl2Withpl4=player1Withplayer4(user2Choice,user4Choice);
    	System.out.println("The Value of Player 2 with Player 4 : "+pl2Withpl4);
    	System.out.println("----------------------------------------------------------------");
    	player3.value2(random,user1Choice,user2Choice,user3Choice,user4Choice);
    	
	}
	
	public static  int player1Withplayer2(String user2Choice, String user1Choice)
	   { 
		   
		   if(user2Choice=="rock")
			   {
			   				if(user2Choice.equals(user1Choice))
				   				 user2count+=0;
				   			else if((user2Choice=="rock") && (user1Choice=="paper"))
				   				user2count+=0;
				   			else if((user2Choice=="rock") && (user1Choice=="scissor"))
				   				 user2count+=1;	
			   				
			   }
			else if(user2Choice=="paper")
				   {
					   			if(user2Choice.equals(user1Choice))
					   				user2count+=0;
					   			else if((user2Choice=="paper" && user1Choice=="rock"))
					   				  user2count+=1;
					   			else if((user2Choice=="paper") &&( user1Choice=="scissor"))
					   				user2count+=0;			
				   }
			else if(user2Choice=="scissor")
				   {
					   		if(user2Choice.equals(user1Choice))
					   			user2count+=0;
					   		else if((user2Choice=="scissor" && user1Choice=="rock"))
					   			user2count+=0;
					   		else if((user2Choice=="scissor") &&( user1Choice=="paper"))
					   			user2count+=1; 		
				   }
		   return user2count;
				   }
	   
	   public static  int player1Withplayer3(String user2Choice, String user3Choice)
	   { 
		   
		   if(user2Choice=="rock")
			   {
			   				if(user2Choice.equals(user3Choice))
				   				 user2_3_count+=0;
				   			else if((user2Choice=="rock") && (user3Choice=="paper"))
				   				user2_3_count+=0;
				   			else if((user2Choice=="rock") && (user3Choice=="scissor"))
				   				 user2_3_count+=1;	
			   				
			   }
			else if(user2Choice=="paper")
				   {
					   			if(user2Choice.equals(user3Choice))
					   				user2_3_count+=0;
					   			else if((user2Choice=="paper" && user3Choice=="rock"))
					   				  user2_3_count+=1;
					   			else if((user2Choice=="paper") &&( user3Choice=="scissor"))
					   				user2_3_count+=0;			
				   }
			else if(user2Choice=="scissor")
				   {
					   		if(user2Choice.equals(user3Choice))
					   			user2_3_count+=0;
					   		else if((user2Choice=="scissor" && user3Choice=="rock"))
					   			user2_3_count+=0;
					   		else if((user2Choice=="scissor") &&( user3Choice=="paper"))
					   			user2_3_count+=1; 		
				   }
		   return user2_3_count;
				   }
	   
	   public static  int player1Withplayer4(String user2Choice, String user4Choice)
	   { 
		   
		   if(user2Choice=="rock")
			   {
			   				if(user2Choice.equals(user4Choice))
				   				 user2_4_count+=0;
				   			else if((user2Choice=="rock") && (user4Choice=="paper"))
				   				user2_4_count+=0;
				   			else if((user2Choice=="rock") && (user4Choice=="scissor"))
				   				 user2_4_count+=1;	
			   				
			   }
			else if(user2Choice=="paper")
				   {
					   			if(user2Choice.equals(user4Choice))
					   				user2_4_count+=0;
					   			else if((user2Choice=="paper" && user4Choice=="rock"))
					   				  user2_4_count+=1;
					   			else if((user2Choice=="paper") &&( user4Choice=="scissor"))
					   				user2_4_count+=0;			
				   }
			else if(user2Choice=="scissor")
				   {
					   		if(user2Choice.equals(user4Choice))
					   			user2_4_count+=0;
					   		else if((user2Choice=="scissor" && user4Choice=="rock"))
					   			user2_4_count+=0;
					   		else if((user2Choice=="scissor") &&( user4Choice=="paper"))
					   			user2_4_count+=1; 		
				   }
		   return user2_4_count;
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
