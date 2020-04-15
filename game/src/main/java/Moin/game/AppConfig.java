package Moin.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig { // its a configuration class just like we define beans in .xml file
	
	@Bean
	public player1 getplayer1() { // this wil; return an object of player1
		return  new player1();
	}
	@Bean
	public player2 getplayer2() { //@bean is a property tht shows  this class is available for obj
		return new player2();
	}
	@Bean
	public player3 getplayer3() {
		return new player3();
	}
	
	@Bean
	public player4 getplayer4() {
		return new player4();
	}

}
