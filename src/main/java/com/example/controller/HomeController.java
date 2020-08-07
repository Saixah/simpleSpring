package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.DogDao;
import com.example.model.Dog;


@RestController
public class HomeController {
	
	@Autowired
	private DogDao dogDao;
	
	@RequestMapping("home")
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping("addDog")
	public void addDog(Dog dog) {
		dogDao.saveDog(dog);
	}
	
}
