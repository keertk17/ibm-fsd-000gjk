package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Interfacce.PlayerInterface;
import com.example.demo.Model.Player;

@Controller
public class AppController {
	
	@Autowired
	private PlayerInterface playerInterface;
@RequestMapping("/")
public String home() {
	return "home";
}

@RequestMapping("/fetchPlayers")
public String listPlayer(Model model) {
	List<Player> player =playerInterface.getPlayers();
	model.addAttribute("ll",player);
	return "/player/list";
}
	@RequestMapping("/playerSave")
	public String savePlayer(@ModelAttribute("ll") Player player) {
		playerInterface.savePlayer(player);
		return "redirect:/fetchPlayers/";
	}
	@RequestMapping("/playerAddForm")
	public String givePlayer(Model model) {
		Player player = new Player();
		model.addAttribute("ll",player);
		return "/player/add-form";
	}
	@GetMapping("/playerEdit")
	public String editPlayer(Model model,@RequestParam("id") Integer id) {
	Player player=	playerInterface.findPlayer(id);
		model.addAttribute("ll",player);
		return "/player/add-form";	
	}
	@GetMapping("/playerDelete")
	public String deletePlayer(@RequestParam("id") Integer id) {
		playerInterface.deletePlayer(id);
		return "redirect:/fetchPlayers/";
		
	}
}
