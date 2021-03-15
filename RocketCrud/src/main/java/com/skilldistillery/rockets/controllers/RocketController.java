package com.skilldistillery.rockets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.rockets.data.RocketDAO;
import com.skilldistillery.rockets.entities.Rocket;

@Controller
public class RocketController {

	@Autowired 
	private RocketDAO dao;
	

	@RequestMapping(path={"/", "home.do"})
	public String index(Model model) {
		List<Rocket> rockets = dao.findAll();
		model.addAttribute("rockets", rockets); //debug 
		return "index";
	}
	
	@RequestMapping(path="getRocket.do")
	public String showRocket(Integer rid, Model model) {
		Rocket rocket = dao.findById(rid);
		
		model.addAttribute("rocket", rocket);
		
		return "rocket/result";
	}
	
	
	@RequestMapping("addRocket.do")
	public ModelAndView addRocket(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("rock", model);
		mv.setViewName("rocket/add");
		return mv;
	}
	
	  @RequestMapping(path = "addNewRocket.do", method= RequestMethod.POST)
	  public String setRocket(Rocket rocket, String name, Integer height, String description ) {
		  ModelAndView mv = new ModelAndView();
		  rocket.setName(name);
		  rocket.setHeight(height);
		  rocket.setDescription(description);
		  dao.create(rocket);
		  mv.addObject("rocket", rocket);
//		  redir.addFlashAttribute("rocket", rocket);
//		  mv.setViewName("rocket/result");
		  return "rocket/result";
	  }
	  
	  
//	  // TODO : Implement a request handler for:
//	  // path "stateAdded.do"
//	  // method GET
//	  // command object : State
//	  // return : ModelAndView
//	  // view : "WEB-INF/result.jsp"; "result" if using InternalResourceViewResolver with prefix/suffix
//	  // Note: fix other request handler methods to use InternalResourceViewResolver
//	  @RequestMapping(path="rocketAdded.do", method = RequestMethod.GET)
//	  public ModelAndView  newRocket() {
//		  ModelAndView mv = new ModelAndView();
//		  mv.setViewName("rocket/result");
//		  return mv;
//	  }
	
	
}
