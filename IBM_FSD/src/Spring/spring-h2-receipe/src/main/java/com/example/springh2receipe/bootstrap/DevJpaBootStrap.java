package com.example.springh2receipe.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2receipe.model.Ingredients;
import com.example.springh2receipe.model.Notes;
import com.example.springh2receipe.model.Receipe;
import com.example.springh2receipe.repository.IngredientsRepository;
import com.example.springh2receipe.repository.NotesRepository;
import com.example.springh2receipe.repository.ReceipeRepository;
@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{
	private IngredientsRepository ingredientsRepository;
	private NotesRepository notesRespository;
	private ReceipeRepository receipeRepository;

	public DevJpaBootStrap(IngredientsRepository ingredientsRepository, NotesRepository notesRespository,
			ReceipeRepository receipeRepository) {
		super();
		this.ingredientsRepository = ingredientsRepository;
		this.notesRespository = notesRespository;
		this.receipeRepository = receipeRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}

	private void init() {

		Ingredients in=new Ingredients(500,"grill",1l);
		Receipe rec=new Receipe("30min","GrillChicken","hard","north","4","ccc","http",1l,"20min");
		Notes n=new Notes("aaa");
//		rec.getIngredients().add(in);
//		n.getReceipes().add(rec);
//		
		ingredientsRepository.save(in);
		receipeRepository.save(rec);
		notesRespository.save(n);
	}

}
