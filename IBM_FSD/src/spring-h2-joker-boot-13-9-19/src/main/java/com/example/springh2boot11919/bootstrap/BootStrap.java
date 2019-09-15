package com.example.springh2boot11919.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2boot11919.model.Joke;
import com.example.springh2boot11919.repository.JokeRepository;
@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent>{

	JokeRepository jokeRepository;
	
	
	public BootStrap(JokeRepository jokeRepository) {
		super();
		this.jokeRepository = jokeRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		intit();
	}

	private void intit() {
		// TODO Auto-generated method stub
		Joke joke1 = new Joke("A man got hit in the head with a can of Coke, but he was alright because it was a soft drink.\r\n" + 
				"\r\n" + 
				" \r\n");
		Joke joke2 = new Joke("Standing in the park, I was wondering why a Frisbee gets larger the closer it gets. Then it hit me");
		jokeRepository.save(joke1);
		jokeRepository.save(joke2);
	}

}
