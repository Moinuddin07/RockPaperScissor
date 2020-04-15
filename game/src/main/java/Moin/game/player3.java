package Moin.game;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class player3 {

	static String user1Choice;
	static String user2Choice;
	static String user3Choice;
	static String user4Choice;
	static int user3count;
	static int user3_2_count;
	static int user3_4_count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 player1 player1= context.getBean(player1.class);
		 player2 player2=context.getBean(player2.class);
		 player3 player3=context.getBean(player3.class);
		 player4 player4=context.getBean(player4.class);
		Random random=new Random();
		

	}/*
	public static void value1(Random random,String user1Choice,String user2Choice,String user3CHoice,String user4Choice)
	  {
	    	 
	    	value2(random, user1Choice,user2Choice,user3Choice,user4Choice);
	    	
	    	}*/
	public static void value2(Random random,String user1Choice,String user2Choice,String user3Choice,String user4Choice)
	{

    	int pl3Withpl1=player1Withplayer2(user3Choice,user1Choice);
    	System.out.println("The Value of Player 3 with Player 1 : " +pl3Withpl1);
    	
    	int pl3Withpl2=player1Withplayer3(user3Choice,user2Choice);
    	System.out.println("The Value of Player 3 with Player 2 : "+pl3Withpl2);
    	
    	
    	int pl3Withpl4=player1Withplayer4(user3Choice,user4Choice);
    	System.out.println("The Value of Player 3 with Player 4 : "+pl3Withpl4);
    	System.out.println("----------------------------------------------------------------");
    	player4.value2(random,user1Choice,user2Choice,user3Choice,user4Choice);
    	
	}
	
	public static  int player1Withplayer2(String user3Choice, String user1Choice)
	   { 
		   
		   if(user3Choice=="rock")
			   {
			   				if(user3Choice.equals(user1Choice))
				   				 user3count+=0;
				   			else if((user3Choice=="rock") && (user1Choice=="paper"))
				   				user3count+=0;
				   			else if((user3Choice=="rock") && (user1Choice=="scissor"))
				   				 user3count+=1;	
			   				
			   }
			else if(user3Choice=="paper")
				   {
					   			if(user3Choice.equals(user1Choice))
					   				user3count+=0;
					   			else if((user3Choice=="paper" && user1Choice=="rock"))
					   				  user3count+=1;
					   			else if((user3Choice=="paper") &&( user1Choice=="scissor"))
					   				user3count+=0;			
				   }
			else if(user3Choice=="scissor")
				   {
					   		if(user3Choice.equals(user1Choice))
					   			user3count+=0;
					   		else if((user3Choice=="scissor" && user1Choice=="rock"))
					   			user3count+=0;
					   		else if((user3Choice=="scissor") &&( user1Choice=="paper"))
					   			user3count+=1; 		
				   }
		   return user3count;
				   }
	   
	   public static  int player1Withplayer3(String user3Choice, String user2Choice)
	   { 
		   
		   if(user3Choice=="rock")
			   {
			   				if(user3Choice.equals(user2Choice))
				   				 user3_2_count+=0;
				   			else if((user3Choice=="rock") && (user2Choice=="paper"))
				   				user3_2_count+=0;
				   			else if((user3Choice=="rock") && (user2Choice=="scissor"))
				   				 user3_2_count+=1;	
			   				
			   }
			else if(user3Choice=="paper")
				   {
					   			if(user3Choice.equals(user2Choice))
					   				user3_2_count+=0;
					   			else if((user3Choice=="paper" && user2Choice=="rock"))
					   				  user3_2_count+=1;
					   			else if((user3Choice=="paper") &&( user2Choice=="scissor"))
					   				user3_2_count+=0;			
				   }
			else if(user3Choice=="scissor")
				   {
					   		if(user3Choice.equals(user2Choice))
					   			user3_2_count+=0;
					   		else if((user3Choice=="scissor" && user2Choice=="rock"))
					   			user3_2_count+=0;
					   		else if((user3Choice=="scissor") &&( user2Choice=="paper"))
					   			user3_2_count+=1; 		
				   }
		   return user3_2_count;
				   }
	   
	   public static  int player1Withplayer4(String user3Choice, String user4Choice)
	   { 
		   
		   if(user3Choice=="rock")
			   {
			   				if(user3Choice.equals(user4Choice))
				   				 user3_4_count+=0;
				   			else if((user3Choice=="rock") && (user4Choice=="paper"))
				   				user3_4_count+=0;
				   			else if((user3Choice=="rock") && (user4Choice=="scissor"))
				   				 user3_4_count+=1;	
			   				
			   }
			else if(user3Choice=="paper")
				   {
					   			if(user3Choice.equals(user4Choice))
					   				user3_4_count+=0;
					   			else if((user3Choice=="paper" && user4Choice=="rock"))
					   				  user3_4_count+=1;
					   			else if((user3Choice=="paper") &&( user4Choice=="scissor"))
					   				user3_4_count+=0;			
				   }
			else if(user3Choice=="scissor")
				   {
					   		if(user3Choice.equals(user4Choice))
					   			user3_4_count+=0;
					   		else if((user3Choice=="scissor" && user4Choice=="rock"))
					   			user3_4_count+=0;
					   		else if((user3Choice=="scissor") &&( user4Choice=="paper"))
					   			user3_4_count+=1; 		
				   }
		   return user3_4_count;
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
