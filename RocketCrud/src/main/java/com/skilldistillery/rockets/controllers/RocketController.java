package com.skilldistillery.rockets.controllers;

import java.rmi.server.RMIClassLoader;
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
		model.addAttribute("rockets", rockets); 
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
	
//TODO set up redir 
	
	  @RequestMapping(path = "addNewRocket.do", method= RequestMethod.POST)
	  public String setRocket(Rocket rocket, String name, Integer height, String description, Double diameter, String country ) {
		  ModelAndView mv = new ModelAndView();
		  rocket.setName(name);
		  rocket.setHeight(height);
		  rocket.setDescription(description);
		  rocket.setDiameter(diameter);
		  rocket.setCountry(country);
		  dao.create(rocket);
		  mv.addObject("rocket", rocket);
//		  redir.addFlashAttribute("rocket", rocket);
//		  mv.setViewName("rocket/result");
		  return "rocket/result";
	  }
	  
	  @RequestMapping(path = "updateRocketForm.do")
	  public ModelAndView updatePage(Integer rid) {
		  ModelAndView mv = new ModelAndView();
		  Rocket rocket = dao.findById(rid);
		  
		  mv.addObject("rocket", rocket);
		  mv.setViewName("rocket/update");
		  return mv;
	  }
	  
	  @RequestMapping(path="updateRocket.do", method= RequestMethod.POST)
	  public ModelAndView updateRocket(int rid, String name, Integer height, String description ) {
		  ModelAndView mv = new ModelAndView();
		  Rocket rocket = new Rocket();
		  rocket.setName(name);
		  rocket.setHeight(height);
		  rocket.setDescription(description);
		  dao.update(rid, name, height, description);
		  mv.addObject("rocket", rocket);
		  mv.setViewName("rocket/result");  
		  
		  return mv;
		  
	  }

	  @RequestMapping(path="deleteRocketForm.do")
	  public ModelAndView deletePage(Integer rid) {
		  ModelAndView mv = new ModelAndView();
		  Rocket rocket = dao.findById(rid);
		  mv.addObject("rocket", rocket);
		  mv.setViewName("rocket/delete");
		  return mv;
		  
	  }
	  
	  @RequestMapping(path="deleteRocket.do", method = RequestMethod.POST)
	  public ModelAndView deleteRocket(int rid) {
		  ModelAndView mv = new ModelAndView();
		  Rocket rocket = new Rocket();
		  dao.delete(rid);
		  mv.addObject("rocket", rocket);
		  mv.setViewName("rocket/result");
		  return mv;
	  }

	
	
}
