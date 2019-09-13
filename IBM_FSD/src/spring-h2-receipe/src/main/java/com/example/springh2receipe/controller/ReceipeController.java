package com.example.springh2receipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springh2receipe.model.Receipe;
import com.example.springh2receipe.repository.IngredientsRepository;
import com.example.springh2receipe.repository.NotesRepository;
import com.example.springh2receipe.repository.ReceipeRepository;



@Controller
@RequestMapping("/receipes")

public class ReceipeController {
private IngredientsRepository ingredientsRepository;
private ReceipeRepository receipeRepository;
private NotesRepository notesRepository;
public ReceipeController(IngredientsRepository ingredientsRepository, ReceipeRepository receipeRepository,
		NotesRepository notesRepository) {
	super();
	this.ingredientsRepository = ingredientsRepository;
	this.receipeRepository = receipeRepository;
	this.notesRepository = notesRepository;
}
@RequestMapping("/receipe")
public String getAllReceipes(Model theModel)
{
	theModel.addAttribute("receipes",receipeRepository.findAll());
	return "receipes";
}
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel) {
	
	// create model attribute to bind form data
Receipe theReceipe = new Receipe();
	
	theModel.addAttribute("receipe", theReceipe);
	
	return "receipe-form";
}
@PostMapping("/delete")
public String delete(@RequestParam("receipeId") long theId) {
	
	// delete the employee
	receipeRepository.deleteById(theId);
	
	// redirect to /employees/list
	return "redirect:/receipes/list";
	
}
@PostMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("receipeId") long theId,
								Model theModel) {
	
	// get the employee from the service
	Optional<Receipe> theReceipe =receipeRepository.findById(theId);
	
	// set employee as a model attribute to pre-populate the form
	theModel.addAttribute("receipe", theReceipe);
	
	// send over to our form
	return "receipe-form";			
}
@PostMapping("/save")
public String saveEmployee(@ModelAttribute("receipe") Receipe theReceipe) {
	// save the employee
	receipeRepository.save(theReceipe);
	// use a redirect to prevent duplicate submissions
	return "redirect:/receipes/list";
}
@GetMapping("/list")
public String listEmployees(Model theModel) {
	// get employees from db
	List<Receipe> theReceipe = (List<Receipe>) receipeRepository.findAll();
	// add to the spring model
	theModel.addAttribute("receipes", theReceipe);
	
	return "receipes";
}


}
