package Moin.game;

import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Moin.game.player1.*;
/**
 * Hello world!
 *
 */
public class App 
{
	static String user1Choice;
	static String user2Choice;
	static String user3Choice;
	static String user4Choice;
	static int user1count;
	static int user1_2_count;
	static int user1_3_count;
	
    public static void main( String[] args )
    
    {
         int i=0;
    	showRules();
    	Random random=new Random();
    	
    	
    	 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);//its a configuration class from where we have declared our four players;
    	
    	 player1 player1= context.getBean(player1.class);// getBean means get the object which will given by Spring;
    	 player2 player2=context.getBean(player2.class);// from appconfig. class 
    	 player3 player3=context.getBean(player3.class);
    	 player4 player4 =context.getBean(player4.class);
    	 
    	 // no of iterations 
    	 while(i<=5) {
    	player1.value1(random);
    	System.out.println("Iteration :"+" "+i+"\n");
    	i++;
    	 }
    	}
    
    
    
    public static void showRules() 
    {
    	System.out.println("----------------------------------------------------------------");
    	System.out.println("Rules is:\n");
    	System.out.println("1-- Paper Beats Rock ");
    	System.out.println("2-- Rock Beats Scissors ");
    	System.out.println("3-- Scissors Beats Paper\n\n");
    	
    }
    }

   
   
   
	
	   
   
     
     

