package com.example.soccer_league_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.soccer_league_jpa.model.League;
import com.example.soccer_league_jpa.repository.LeagueRepository;
import com.example.soccer_league_jpa.service.LeagueService;
import com.example.soccer_league_jpa.service.LeagueServiceImpl;



@Controller
@RequestMapping("/leagues")
public class LeagueController  {
	
	@Autowired
	private LeagueService leagueService;
	
	@GetMapping("/list")
	public String listLeague(Model theModel) {
		
		// get employees from db
		List<League> theLeague = leagueService.findAll();
		
		// add to the spring model
		theModel.addAttribute("league", theLeague);
		
		return "list-leagues";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		League theLeague=new League();
		
		theModel.addAttribute("league", theLeague);
		
		return "league-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("league") League theLeague) {
		
		// save the employee
		leagueService.save(theLeague);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/leagues/list";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("leagueId") long theId) {
		
		// delete the employee
		leagueService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/leagues/list";
		
	}
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("leagueId") int theId,
									Model theModel) {
		
		// get the employee from the service
		League theLeague = leagueService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("league", theLeague);
		
		// send over to our form
		return "league-form";			
	}
	
	
	
	

}
