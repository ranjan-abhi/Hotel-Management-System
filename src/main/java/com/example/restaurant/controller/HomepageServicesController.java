package com.example.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Homepage;
import com.example.restaurant.model.Login;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.model.RestaurantAdmin;
import com.example.restaurant.service.HomepageService;
import com.example.restaurant.service.HomepageServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
public class HomepageServicesController {
	
	HomepageService homepageService = new HomepageServiceImpl();
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	  public ModelAndView search(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView("searchForm");
	    mav.addObject("search", new Homepage());

	    return mav;
	  }
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	  public ModelAndView searchResult(@ModelAttribute("homepage") Homepage homepage) {
		
		List<Object> list = homepageService.getQueryResult(homepage);
		ModelAndView mav = new ModelAndView("searchForm");
		
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		List<Dish> dishs = new ArrayList<Dish>();
		
		for (Object object : list) {
			
			if(object.getClass().getName().endsWith("Restaurant")){
				restaurants.add((Restaurant) object);
			}
			
			else if(object.getClass().getName().endsWith("Dish")){
				dishs.add((Dish) object);
			}
		}
		
		mav.addObject("list", restaurants);
		mav.addObject("dish", dishs);
		mav.addObject("search", new Homepage());
	    return mav;
	  }

}
